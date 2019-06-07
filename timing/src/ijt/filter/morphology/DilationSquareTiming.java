/**
 * 
 */
package ijt.filter.morphology;

import ij.IJ;
import ij.ImagePlus;
import ij.process.ImageProcessor;
import ijt.filter.morphology.strel.SquareStrel;

import java.io.IOException;

/**
 * @author David Legland
 *
 */
public class DilationSquareTiming {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		ImagePlus imagePlus = IJ.openImage("files/CA_QK_004_H1.tif");
		
		int[] diameters = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 100, 200};
		
		ImageProcessor image = imagePlus.getProcessor();
		
		for (int i = 0; i < diameters.length; i++) {
			Strel se = SquareStrel.fromDiameter(diameters[i]);
			
			long t0 = System.currentTimeMillis();
			se.dilation(image);
			
			long t1 = System.currentTimeMillis();
			
			double dt = (t1 - t0) / 1000.;
			System.out.println("diameter " + diameters[i] + ", time = " + dt + " s");
		}
		
	}

}
