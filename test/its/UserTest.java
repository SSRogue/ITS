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
public class UserTest {
    
    public UserTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("@BeforeClass UserTest.");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("@AfterClass UserTest.");
    }
    
    @Before
    public void setUp() {
        System.out.println("@Before UserTest.");
    }
    
    @After
    public void tearDown() {
        System.out.println("@After UserTest.");
    }

    /**
     * Test of setCarType method, of class User.
     */
    @Test
    public void testSetCarType() {
        System.out.println("setCarType");
        char carType = ' ';
        User instance = new User();
        instance.setCarType(carType);
        char expResult = ' ';
        char result = instance.getCarType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setUserName method, of class User.
     */
    @Test
    public void testSetUserName() {
        System.out.println("setUserName");
        String userName = "chen";
        User instance = new User();
        instance.setUserName(userName);
        String expResult = "chen";
        String result = instance.getUserName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setUserPassword method, of class User.
     */
    @Test
    public void testSetUserPassword() {
        System.out.println("setUserPassword");
        String userPassword = "chen";
        User instance = new User();
        instance.setUserPassword(userPassword);
        String expResult = "chen";
        String result = instance.getUserPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCarType method, of class User.
     */
    @Test
    public void testGetCarType() {
        System.out.println("getCarType");
        char carType = ' ';
        User instance = new User();
        instance.setCarType(carType);
        char expResult = ' ';
        char result = instance.getCarType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getUserName method, of class User.
     */
    @Test
    public void testGetUserName() {
        System.out.println("getUserName");
        String userName = "chen";
        User instance = new User();
        instance.setUserName(userName);
        String expResult = "chen";
        String result = instance.getUserName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getUserPassword method, of class User.
     */
    @Test
    public void testGetUserPassword() {
        System.out.println("getUserPassword");
        String userPassword = "chen";
        User instance = new User();
        instance.setUserPassword(userPassword);
        String expResult = "chen";
        String result = instance.getUserPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
