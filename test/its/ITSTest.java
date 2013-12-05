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
public class ITSTest {
    
    public ITSTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("@BeforeClass ITS.");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("@AfterClass ITS.");
    }
    
    @Before
    public void setUp() {
        System.out.println("@Before ITS.");
    }
    
    @After
    public void tearDown() {
        System.out.println("@After ITS.");
    }

    /**
     * Test of main method, of class ITS.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ITS.main(args);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
}
