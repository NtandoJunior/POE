/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {

    
    @Test
    public void testCorrectUsernameFormat() {
        Login login = new Login("kyl_1", "Ch&&sec@ke99!", "+27838968976", "Kyle", "Smith");
        assertTrue(login.checkUserName());
        assertEquals("Welcome Kyle ,Smith it is great to see you again.", login.returnLoginStatus());
    }

    
    @Test
    public void testIncorrectUsernameFormat() {
        Login login = new Login("kyle!!!!!!!", "Ch&&sec@ke99!", "+27838968976", "Kyle", "Smith");
        assertFalse(login.checkUserName());
        assertEquals("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.",
                login.registerUser());
    }

    
    @Test
    public void testValidPasswordComplexity() {
        Login login = new Login("kyl_1", "Ch&&sec@ke99!", "+27838968976", "Kyle", "Smith");
        assertTrue(login.checkPasswordComplexity());
    }

    
    @Test
    public void testInvalidPasswordComplexity() {
        Login login = new Login("kyl_1", "password", "+27838968976", "Kyle", "Smith");
        assertFalse(login.checkPasswordComplexity());
        assertEquals("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.",
                login.registerUser());
    }

    
    @Test
    public void testCorrectCellNumber() {
        Login login = new Login("kyl_1", "Ch&&sec@ke99!", "+27838968976", "Kyle", "Smith");
        assertTrue(login.checkCellPhoneNumber());
    }

    
    @Test
    public void testIncorrectCellNumber() {
        Login login = new Login("kyl_1", "Ch&&sec@ke99!", "08966553", "Kyle", "Smith");
        assertFalse(login.checkCellPhoneNumber());
    }

    
    @Test
    public void testLoginSuccess() {
        Login login = new Login("kyl_1", "Ch&&sec@ke99!", "+27838968976", "Kyle", "Smith");
        login.registerUser(); // saves credentials internally
        assertTrue(login.loginUser("kyl_1", "Ch&&sec@ke99!"));
    }

    
    @Test
    public void testLoginFailure() {
        Login login = new Login("kyl_1", "Ch&&sec@ke99!", "+27838968976", "Kyle", "Smith");
        login.registerUser(); // saves credentials internally
        assertFalse(login.loginUser("wrong", "wrongpass"));
    }
}
