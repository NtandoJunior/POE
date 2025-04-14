/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UtilityTest {
    private Utility util;

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() {
        util = new Utility("Smanga", 101);
    }

    @AfterEach
    public void tearDown() throws Exception {
    }

    @Test
    public void testIsEven() {
        assertTrue(util.isEven(4));
        assertFalse(util.isEven(5));
    }

    @Test
    public void testGreetUser() {
        assertEquals("Hello, Alice!", util.greetUser("Alice"));
        assertEquals("Hello, Guest!", util.greetUser(""));
    }

    @Test
    public void testMultiply() {
        assertEquals(12, util.multiply(3, 4));
        assertEquals(0, util.multiply(0, 100));
    }

    @Test
    public void testUserDetails() {
        assertEquals("Smanga", util.getUserName());
        assertEquals(101, util.getUserId());

        util.setUserName("Lebo");
        util.setUserId(202);

        assertEquals("Lebo", util.getUserName());
        assertEquals(202, util.getUserId());
    }
}
