/**
 * 
 */
package ijt.filter.distmap;

import ij.ImagePlus;
import ij.process.ImageProcessor;
import ij.process.FloatProcessor;

/**
 * @deprecated replaced by {@link ijt.binary.distmap.ChamferDistance3x3Float}
 * @see ijt.binary.distmap.ChamferDistance3x3Float
 */
@Deprecated
public class DistanceMapFloatCalculator extends ijt.binary.distmap.ChamferDistance3x3Float {

	public DistanceMapFloatCalculator(float[] weights) {
		super(weights);
	}

	public DistanceMapFloatCalculator(float[] weights, boolean normalize) {
		super(weights, normalize);
	}


	public ImagePlus computeDistanceMap(ImagePlus mask, String newName) {
		return distanceMap(mask, newName);
	}
	
	public FloatProcessor computeDistanceMap(ImageProcessor mask) {
		return distanceMap(mask);
	}
}
