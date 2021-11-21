package sfcEditor.editor;

import org.eclipse.core.runtime.Platform;
import org.eclipse.gef.palette.ConnectionCreationToolEntry;
import org.eclipse.gef.palette.CreationToolEntry;
import org.eclipse.gef.palette.CombinedTemplateCreationEntry;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteToolbar;
import org.eclipse.gef.palette.SelectionToolEntry;
import org.eclipse.gef.requests.CreationFactory;
import org.eclipse.jface.resource.ImageDescriptor;
import org.osgi.framework.Bundle;

import sfcEditor.Activator;
import sfcEditor.editor.factory.*;
import sfcEditor.editor.tool.CreationAndDirectEditTool;

public class SFCGraphicalEditorPalette extends PaletteRoot {
	
	PaletteToolbar tb;
			
	PaletteDrawer pdSteps;
	PaletteDrawer pdTransitions;
	PaletteDrawer pdBranches;
	
	Bundle bundle = Platform.getBundle(Activator.PLUGIN_ID);
	
	public SFCGraphicalEditorPalette() {
		addToolbar();
		addStepsDrawer();
		addTransitionsDrawer();
		addBranchsDrawer();
	}

	private void addToolbar() {
		tb = new PaletteToolbar("Toolbar");
		SelectionToolEntry entry = new SelectionToolEntry();
		setDefaultEntry(entry);
		tb.add(entry);
		add(tb);
	}
	
	private void addStepsDrawer() {
		pdSteps = new PaletteDrawer("Steps");
		
		ImageDescriptor img = ImageDescriptor.createFromURL(bundle.getEntry("icons/initstep.png"));
		addCombinedTemplateCreationEntryToPalette("Initial step", "Create an initial step.", new InitialStepFactory(), img, img, pdSteps);
		
		img = ImageDescriptor.createFromURL(bundle.getEntry("icons/step.png"));
		addCombinedTemplateCreationEntryToPalette("Step", "Create a new step."
				+ "Use selection connection to connect the action to a step.", new StepFactory(), img, img, pdSteps);

		img = ImageDescriptor.createFromURL(bundle.getEntry("icons/action.png"));
		addCombinedTemplateCreationEntryToPalette("Action", "Create a new action. "
				+ "Use selection connection to connect the action to a step.", new ActionFactory(), img, img, pdSteps);
		add(pdSteps);
	}
	
	private void addTransitionsDrawer() {
		pdTransitions = new PaletteDrawer("Transition");
		
		ImageDescriptor img = ImageDescriptor.createFromURL(bundle.getEntry("icons/transition.png"));
		addCombinedTemplateCreationEntryToPalette("Transition", "Create a new transition", 
				new TransitionFactory(), img, img, pdTransitions);
		add(pdTransitions);
	}
	
	private void addBranchsDrawer() {
		pdBranches = new PaletteDrawer("Connections");
		
		ImageDescriptor img = ImageDescriptor.createFromURL(bundle.getEntry("icons/selection.png"));
		addConnectionCreationToolEntryToPalette("Selection connection", 
	    		"Creates a new selection connection. With this you can create branches that begin "
	    		+ "and end with a transition where only one will be executed, those whose transition "
	    		+ "condition became first true.", 
	    		new SelectionFactory(), img, img, pdBranches);
	    
	    img = ImageDescriptor.createFromURL(bundle.getEntry("icons/simultaneous.png"));
	    addConnectionCreationToolEntryToPalette("Simultaneous branch", 
	    		"Creates a new simultaneous connection. With this you can create branches that begin " 
	    		+ "and end with a step. They will be executed all paralell.", 
	    		new SimultaneousFactory(), img, img, pdBranches);
	    add(pdBranches);
	} 

	// Add an item to the palette, that can be placed in the editor through drag and drop
	private void addCombinedTemplateCreationEntryToPalette(String label, String shortDesc, CreationFactory factory, 
			ImageDescriptor imgSmall, ImageDescriptor imgLarge, PaletteDrawer paletteDrawer) {
		CombinedTemplateCreationEntry entry = new CombinedTemplateCreationEntry(label, 
				shortDesc, factory, imgSmall, imgLarge);
		entry.setToolClass(CreationAndDirectEditTool.class);
		paletteDrawer.add(entry);
	}

	// Add an item to the palette, that does not support drag and drop
	private void addCreationToolEntryToPalette(String label, String shortDesc, CreationFactory factory, 
			ImageDescriptor imgSmall, ImageDescriptor imgLarge, PaletteDrawer paletteDrawer) {
		CreationToolEntry entry = new CreationToolEntry(label, 
				shortDesc, factory, imgSmall, imgLarge);
		entry.setToolClass(CreationAndDirectEditTool.class);
		paletteDrawer.add(entry);
	}

	// Add an connection item to the palette
	private void addConnectionCreationToolEntryToPalette(String label, String shortDesc, CreationFactory factory, 
			ImageDescriptor imgSmall, ImageDescriptor imgLarge, PaletteDrawer paletteDrawer) {
		ConnectionCreationToolEntry entry = new ConnectionCreationToolEntry(label, 
				shortDesc, factory, imgSmall, imgLarge);
		paletteDrawer.add(entry);
	}
}
