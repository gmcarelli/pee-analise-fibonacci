/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import fibonacci.Fibonacci;
import java.math.BigInteger;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class Recursivo {
    
    private Fibonacci fibonacci;
    
    public Recursivo() {
    }

    
    @Before
    public void setUp() {
        
        fibonacci = new Fibonacci(8);
        
    }

    @Test
    public void recursivo() {
        
        assertTrue(fibonacci.recursivo(8).equals(new BigInteger("34")));
        
    }
    
}
