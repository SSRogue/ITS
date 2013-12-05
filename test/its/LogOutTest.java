/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package its;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author chen203g
 */
public class LogOutTest {
    
    public LogOutTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("@BeforeClass ItsSuite.");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("@AfterClass ItsSuite.");
    }
    
    @Before
    public void setUp() {
        System.out.println("@Before ItsSuite.");
    }
    
    @After
    public void tearDown() {
        System.out.println("@After ItsSuite.");
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
