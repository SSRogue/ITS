/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package its;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author chen203g
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({its.UserInterfaceTest.class, its.LoginTest.class, its.LogOutTest.class, its.RegisterTest.class, its.ITSTest.class, its.UserTest.class})
public class ItsSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
