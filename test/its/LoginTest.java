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
public class LoginTest {
    
    public LoginTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("@BeforeClass LoginTest.");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("@AfterClass LoginTest.");
    }
    
    @Before
    public void setUp() {
        System.out.println("@Before LoginTest.");
    }
    
    @After
    public void tearDown() {
        System.out.println("@After LoginTest.");
    }

    /**
     * Test of login method, of class Login.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        User[] user = new User[10];
        /*
        String name1 = "chen";
        String pass1 = "chen";
        user[0].setUserName(name1);
        user[0].setUserPassword(pass1);
        System.out.println("@After LoginTest.");
        int member = 1;
        String name = "chen";
        String password = "chen";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.login(user, member, name, password);
        assertEquals(expResult, result);
        * 
        */
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
