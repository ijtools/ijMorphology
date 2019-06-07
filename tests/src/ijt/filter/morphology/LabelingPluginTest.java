package ijt.filter.morphology;

import static org.junit.Assert.*;
import ij.IJ;
import ij.ImagePlus;
import ij.ImageStack;

import org.junit.Test;

public class LabelingPluginTest {

	@Test
	public final void testComputeLabelsByteImageStack() {
		ImagePlus imagePlus = IJ.openImage("files/matrix2x2x2.tif");
		assertNotNull(imagePlus);
		assertTrue(imagePlus.getStackSize() > 0);

		// load the reference image, and get its size
		ImageStack image = imagePlus.getStack();

		ImageStack labels = LabelingPlugin.computeLabels(image, 6, 8);
		
		assertEquals(0, (int) labels.getVoxel(0, 0, 0));
		assertEquals(1, (int) labels.getVoxel(2, 2, 2));
		assertEquals(0, (int) labels.getVoxel(4, 4, 4));
		assertEquals(8, (int) labels.getVoxel(7, 7, 7));
		assertEquals(0, (int) labels.getVoxel(8, 8, 8));
	}

}
