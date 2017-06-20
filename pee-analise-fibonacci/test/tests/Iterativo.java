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
public class Iterativo {

    private Fibonacci fibonacci;
    
    public Iterativo() {
    }
  
    @Before
    public void setUp() {
        
        fibonacci = new Fibonacci();
        
    }

    @Test
    public void iterativo() {
        
        assertTrue(fibonacci.iterativo(8).equals(new BigInteger("34")));
        
    }
}
