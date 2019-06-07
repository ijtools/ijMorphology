/**
 * 
 */
package ijt.filter.morphology;

import java.io.IOException;

import ij.IJ;
import ij.ImagePlus;
import ij.process.ImageProcessor;
import ijt.filter.morphology.strel.OctagonStrel;

/**
 * @author David Legland
 *
 */
public class DilationOctagonTiming {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		ImagePlus imp = IJ.openImage("files/2432a_corr8.tif");
		
		Strel se = new OctagonStrel(100);
		ImageProcessor img = imp.getProcessor();
		
		long t0 = System.currentTimeMillis();
		se.dilation(img);
		
		long t1 = System.currentTimeMillis();
		
		double dt = t1 - t0;
		System.out.println(dt + " ms");
	}

	public static ImageProcessor computeWhiteTopHat(ImageProcessor input, Strel strel) {
		// First performs closing
		ImageProcessor result = strel.opening(input);
		
		// Compute subtraction of result from original image
		int count = input.getPixelCount();
		for (int i = 0; i < count; i++) {
			// Forces computation using integers, because opening with 
			// octagons can greater than original image (bug)
			int v1 = input.get(i);
			int v2 = result.get(i);
			result.set(i, Math.min(Math.max(v1 - v2, 0), 255));
		}
		
		return result;
	}
}
