/**
 * 
 */
package ijt.filter.morphology;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import ij.IJ;
import ij.ImagePlus;
import ij.ImageStack;
import ijt.filter.morphology.strel.CubeStrel;

import java.io.IOException;

/**
 * @author David Legland
 *
 */
public class DilationCubeTiming {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
	
		ImagePlus imagePlus = IJ.openImage("files/bat-cochlea-volume.tif");
//		ImagePlus imagePlus = IJ.openImage("files/mri-stack.zip");
		assertNotNull(imagePlus);
		assertTrue(imagePlus.getStackSize() > 0);

		int[] diameters = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 100, 200};
		
		ImageStack stack = imagePlus.getStack();
		
		for (int i = 0; i < diameters.length; i++) {
			Strel3D se = new CubeStrel(diameters[i]);
			
			long t0 = System.currentTimeMillis();
			se.dilation(stack);
			
			long t1 = System.currentTimeMillis();
			
			double dt = (t1 - t0) / 1000.;
			System.out.println("diameter " + diameters[i] + ", time = " + dt + " s");
		}
		
	}

}
