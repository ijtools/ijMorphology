/**
 * 
 */
package ijt.filter.morphology.strel;

import ijt.filter.event.AlgoStub;
import ijt.filter.morphology.Strel3D;

/**
 * Implementation basis for structuring elements, that mainly manages the 
 * flag for progress display.
 * @author David Legland
 *
 */
public abstract class AbstractStrel3D extends AlgoStub implements Strel3D {

	private boolean showProgress = true;
	
	public boolean showProgress() {
		return showProgress;
	}
	
	public void showProgress(boolean b) {
		this.showProgress = b;
	}
}
