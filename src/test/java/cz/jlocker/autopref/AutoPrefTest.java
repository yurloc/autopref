package cz.jlocker.autopref;

import junit.framework.TestCase;

/**
 *
 * @author jlocker
 */
public class AutoPrefTest extends TestCase {

    public AutoPrefTest(String testName) {
        super(testName);
    }

    public void testSomeMethod() {
        Holder h = AutoPref.manage(new Holder(), "ahoj");
        h.setValue("zdar");
    }

    public class Holder {

        private String value;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
