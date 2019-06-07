/**
 * 
 */
package ijt.filter.distmap;

import ij.ImagePlus;
import ij.process.ImageProcessor;
import ij.process.ShortProcessor;

/**
 * @deprecated replaced by {@link ijt.binary.distmap.ChamferDistance3x3Short}
 */
@Deprecated
public class DistanceMapShortCalculator extends ijt.binary.distmap.ChamferDistance3x3Short {

	public DistanceMapShortCalculator(short[] weights) {
		super(weights);
	}

	public DistanceMapShortCalculator(short[] weights, boolean normalize) {
		super(weights, normalize);
	}

	public ImagePlus computeDistanceMap(ImagePlus mask, String newName) {
		return distanceMap(mask, newName);
	}
	
	public ShortProcessor computeDistanceMap(ImageProcessor mask) {
		return distanceMap(mask);
	}
}
