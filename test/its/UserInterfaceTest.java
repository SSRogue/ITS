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
public class UserInterfaceTest {
    
    public UserInterfaceTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("@BeforeClass UserInterfaceTest.");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("@AfterClass UserInterfaceTest.");
    }
    
    
    @Before
    public void setUp() {
        System.out.println("@Before UserInterfaceTest.");
    }
    
    @After
    public void tearDown() {
        System.out.println("@After UserInterfaceTest.");
    }

    /**
     * Test of inputComplete method, of class UserInterface.
     */
    @Test
    public void testInputComplete() {
        System.out.println("inputComplete");
        UserInterface instance = new UserInterface();
        boolean expResult = false;
        boolean result = instance.inputComplete();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of inputComplete2 method, of class UserInterface.
     */
    @Test
    public void testInputComplete2() {
        System.out.println("inputComplete2");
        UserInterface instance = new UserInterface();
        boolean expResult = false;
        boolean result = instance.inputComplete2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class UserInterface.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        User[] user = null;
        int member = 0;
        String name = "";
        String password = "";
        UserInterface instance = new UserInterface();
        boolean expResult = false;
        boolean result = instance.login(user, member, name, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class UserInterface.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        UserInterface.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
