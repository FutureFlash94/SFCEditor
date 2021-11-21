package sfcEditor.editor;

import java.io.IOException;
import java.util.EventObject;
 
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor.PropertyValueWrapper;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.dnd.TemplateTransferDragSourceListener;
import org.eclipse.gef.dnd.TemplateTransferDropTargetListener;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.ui.actions.ToggleGridAction;
import org.eclipse.gef.ui.actions.ToggleSnapToGeometryAction;
import org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette;
import org.eclipse.gef.ui.properties.UndoablePropertySheetEntry;
import org.eclipse.gef.ui.properties.UndoablePropertySheetPage;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;
import org.eclipse.ui.views.properties.PropertySheetPage;

import sfcmodel.model.*;
import sfcmodel.model.provider.SFCItemProviderAdapterFactory;
import sfcEditor.action.ShowNameQualifierAction;
import sfcEditor.action.ShowNameQualifierIndicatorAction;
import sfcEditor.action.ShowNameQualifierIndicatorInstructionsAction;
import sfcEditor.action.ShowNameAction;
import sfcEditor.action.ToggleUserPriorityAction;
import sfcEditor.editor.part.SFCEditPartFactory;

public class SFCGraphicalEditor extends GraphicalEditorWithFlyoutPalette {

	private Resource sfcResource;
	private SequentialFunctionChart sfc;

    PropertySheetPage propertyPage;
    
	public SFCGraphicalEditor() {
		setEditDomain(new DefaultEditDomain(this));
	}
	
	@Override 
	protected void initializeGraphicalViewer() {
	    super.initializeGraphicalViewer();
	    getGraphicalViewer().setContents(sfc);
	} 
	
	@Override 
	protected void configureGraphicalViewer() {
		super.configureGraphicalViewer();
		getGraphicalViewer().setEditPartFactory(new SFCEditPartFactory());
		getActionRegistry().registerAction(new ToggleGridAction(getGraphicalViewer())); 
	    getActionRegistry().registerAction(new ToggleSnapToGeometryAction(getGraphicalViewer()));      
	    getGraphicalViewer().setContextMenu(new SFCGraphicalEditorContextMenuProvider(getGraphicalViewer(), getActionRegistry()));  
	    
	    // D&D
	    getGraphicalViewer().addDropTargetListener(new TemplateTransferDropTargetListener(getGraphicalViewer()));
	    getEditDomain().getPaletteViewer().addDragSourceListener(
	      new TemplateTransferDragSourceListener(getEditDomain().getPaletteViewer()));
	    // end D&D
	}
	
	@Override 
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		super.init(site, input);
		loadInput(input);
	}
	private void loadInput(IEditorInput input) {
		SFCPackage.eINSTANCE.eClass(); // This initializes the OPMPackage singleton implementation.
		ResourceSet resourceSet = new ResourceSetImpl();
		if(input instanceof IFileEditorInput) {
		    IFileEditorInput fileInput = (IFileEditorInput) input;
		    IFile file = fileInput.getFile();
		    sfcResource = resourceSet.createResource(URI.createURI(file.getLocationURI().toString()));
		    try {
		    	sfcResource.load(null);
		    	sfc = (SequentialFunctionChart) sfcResource.getContents().get(0);
		    } catch(IOException e) {
		    	// TODO do something smarter.
		    	e.printStackTrace();
		    	sfcResource = null;
		    }
		}
	}
	
	@Override
	protected PaletteRoot getPaletteRoot() {
		return new SFCGraphicalEditorPalette();
	}

	/**
	 * Save the model using the resource from which it was
	 * opened, and mark the current location in the 
	 * {@link CommandStack}.
	 */	  
	@Override
	public void doSave(IProgressMonitor arg0) {
		if(sfcResource == null) {
			return;
		}
		try {
			sfcResource.save(null);
            getCommandStack().markSaveLocation();    
		} catch (IOException e) {
	        // TODO do something smarter.
	        e.printStackTrace();
	    }
	}

	/**
	 * Fire a {@link IEditorPart#PROP_DIRTY} property change and
	 * call super implementation.
	 */
	@Override 
	public void commandStackChanged(EventObject event) {
		firePropertyChange(PROP_DIRTY);
		super.commandStackChanged(event);
    } 
	
	/**
     * This methos implements adapting to {@link IPropertySheetPage}. All other requests are
     * forwarded to the {@link GraphicalEditorWithFlyoutPalette#getAdapter(Class) parent}
     * implementation.
     */
    @Override
    public Object getAdapter(@SuppressWarnings("rawtypes") Class type) {
        if(type.equals(IPropertySheetPage.class)) {
            if(propertyPage == null) {
                propertyPage = (UndoablePropertySheetPage) super
                        .getAdapter(type);
                // A new PropertySourceProvider was implemented to fetch the model
                // from the edit part when required. The property source is provided
                // by the generated EMF classes and wrapped by the AdapterFactoryContentProvider
                // to yield standard eclipse interfaces.
                IPropertySourceProvider sourceProvider = new IPropertySourceProvider() {
                    IPropertySourceProvider modelPropertySourceProvider = new AdapterFactoryContentProvider(new SFCItemProviderAdapterFactory());
 
                    @Override
                    public IPropertySource getPropertySource(Object object) {
                        IPropertySource source = null;
                        if(object instanceof EditPart) {
                            source = modelPropertySourceProvider.getPropertySource(((EditPart) object).getModel());
                        } else {
                            source = modelPropertySourceProvider.getPropertySource(object);
                        }
 
                        if(source != null) {
                            return new UnwrappingPropertySource(source);
                        } else {
                            return null;
                        }
                    }
 
                };
                UndoablePropertySheetEntry root = new UndoablePropertySheetEntry(getCommandStack());
                root.setPropertySourceProvider(sourceProvider);
                propertyPage.setRootEntry(root);
            }
            return propertyPage;
        }
        return super.getAdapter(type);
    }
 
    @Override
    protected void createActions() {
    	ShowNameAction action = new ShowNameAction(this);
        getActionRegistry().registerAction(action);
        getSelectionActions().add(action.getId());
        
        ShowNameQualifierAction action2 = new ShowNameQualifierAction(this);
        getActionRegistry().registerAction(action2);
        getSelectionActions().add(action2.getId());
        
        ShowNameQualifierIndicatorAction action3 = new ShowNameQualifierIndicatorAction(this);
        getActionRegistry().registerAction(action3);
        getSelectionActions().add(action3.getId());

        ShowNameQualifierIndicatorInstructionsAction action4 = new ShowNameQualifierIndicatorInstructionsAction(this);
        getActionRegistry().registerAction(action4);
        getSelectionActions().add(action4.getId());
        
        ToggleUserPriorityAction action5 = new ToggleUserPriorityAction(this);
        getActionRegistry().registerAction(action5);
        getSelectionActions().add(action5.getId());
        
        super.createActions();
    }
    
    /**
     * A property source which unwraps values that are wrapped in an EMF
     * {@link PropertyValueWrapper}
     *
     */
    public class UnwrappingPropertySource implements IPropertySource {
        private IPropertySource source;
 
        public UnwrappingPropertySource(final IPropertySource source) {
            this.source = source;
        }
 
        @Override
        public Object getEditableValue() {
            Object value = source.getEditableValue();
            if(value instanceof PropertyValueWrapper) {
                PropertyValueWrapper wrapper = (PropertyValueWrapper) value;
                return wrapper.getEditableValue(null);
            } else {
                return source.getEditableValue();
            }
        }
 
        @Override
        public IPropertyDescriptor[] getPropertyDescriptors() {
            return source.getPropertyDescriptors();
        }
 
        @Override
        public Object getPropertyValue(Object id) {
            Object value = source.getPropertyValue(id);
            if(value instanceof PropertyValueWrapper) {
                PropertyValueWrapper wrapper = (PropertyValueWrapper) value;
                return wrapper.getEditableValue(null);
            } else {
                return source.getPropertyValue(id);
            }
        }
 
        @Override
        public boolean isPropertySet(Object id) {
            return source.isPropertySet(id);
        }
 
        @Override
        public void resetPropertyValue(Object id) {
            source.resetPropertyValue(id);
        }
 
        @Override
        public void setPropertyValue(Object id, Object value) {
            source.setPropertyValue(id, value);
        }
    }
}
