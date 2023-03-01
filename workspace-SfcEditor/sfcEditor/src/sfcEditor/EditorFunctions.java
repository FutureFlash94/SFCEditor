package sfcEditor;

import org.eclipse.draw2d.geometry.Rectangle;

import sfcmodel.model.Action;
import sfcmodel.model.SequentialFunctionChart;
import sfcmodel.model.SfcObject;
import sfcmodel.model.Step;
import sfcmodel.model.Transition;

public class EditorFunctions {

	// return lowest x-axis value where a sfcObject is
	public static int getLeft(SequentialFunctionChart sfc) {
		int left = 0;
		for(SfcObject sfcObject : sfc.getSfcObjects()) {
			if(sfcObject instanceof Step) {
  				Step s = ((Step)sfcObject);
  				Rectangle rect = s.getConstraintsRectangle();
  				if(rect.getLeft().x < left || left == 0) {
  					left = rect.getLeft().x;
  				}
  			}
			else if(sfcObject instanceof Transition) {
				Transition s = ((Transition)sfcObject);
  				Rectangle rect = s.getConstraintsRectangle();
  				if(rect.getLeft().x < left || left == 0) {
  					left = rect.getLeft().x;
  				}
  			}
		}
		return left;
	}
	
	// return highest x-axis value where a sfcObject is
	public static int getRight(SequentialFunctionChart sfc) {
		int right = 0;
		for(SfcObject sfcObject : sfc.getSfcObjects()) {
			if(sfcObject instanceof Step) {
  				Step s = ((Step)sfcObject);
  				Rectangle rect = s.getConstraintsRectangle();
  				if(rect.getRight().x > right || right == 0) {
  					right = rect.getRight().x;
  				}
  			}
			else if(sfcObject instanceof Transition) {
				Transition s = ((Transition)sfcObject);
  				Rectangle rect = s.getConstraintsRectangle();
  				if(rect.getRight().x > right || right == 0) {
  					right = rect.getRight().x;
  				}
  			}
			else if(sfcObject instanceof Action) {
				Action s = ((Action)sfcObject);
  				Rectangle rect = s.getConstraintsRectangle();
  				if(rect.getRight().x > right || right == 0) {
  					right = rect.getRight().x;
  				}
  			}
		}
		return right;
	}
}
