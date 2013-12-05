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
public class RegisterTest {
    
    public RegisterTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("@BeforeClass RegisterTest.");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("@AfterClass RegisterTest.");
    }
    
    @Before
    public void setUp() {
        System.out.println("@Before RegisterTest.");
    }
    
    @After
    public void tearDown() {
        System.out.println("@After RegisterTest.");
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
