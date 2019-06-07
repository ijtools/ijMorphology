package ijt.filter.morphology;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	// generic classes
	AllTests.class,
	ijt.filter.morphology.geodrec.AllTests.class,
	ijt.filter.morphology.strel.AllTests.class
	})
public class AllTestsRecurse {
  //nothing
}
