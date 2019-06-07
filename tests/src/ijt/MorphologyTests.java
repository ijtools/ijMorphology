package ijt;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	// generic classes
	ijt.binary.distmap.AllTests.class,
	ijt.filter.morphology.AllTests.class,
	ijt.filter.morphology.strel.AllTests.class,
})
public class MorphologyTests {
  //nothing
}
