package junit.entity;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ QuickBeforAfterTest.class, StringHelperParameterizedTest.class, StringHelperTest.class })
public class AllTests {

}
