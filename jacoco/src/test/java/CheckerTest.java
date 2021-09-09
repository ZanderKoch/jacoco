/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Zanders andra acc
 */
public class CheckerTest {
    
    public CheckerTest() {
    }

    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of isPalindrome method, of class Checker.
     */
    @Test
    public void testIsPalindrome() {
        System.out.println("isPalindrome");
        String input = "ABBA";
        Checker instance = new Checker();
        boolean expResult = true;
        boolean result = instance.isPalindrome(input);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsPalindrome_min() {
        System.out.println("isPalindrome_min");
        String input = "A";
        Checker instance = new Checker();
        boolean expResult = true;
        boolean result = instance.isPalindrome(input);
        assertEquals(expResult, result);
    }
    
}
