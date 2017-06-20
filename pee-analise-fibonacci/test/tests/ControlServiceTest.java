/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import control.Control;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author workstation
 */
public class ControlServiceTest {

    private final Control control;

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    public ControlServiceTest() {
        this.control = new Control();

    }
    
    @Test
    public void test(){
        
        //control.forwardData(new String[]{"iterative", "3000"});
        
        assertTrue(control.forwardData(new String[]{"iterative", "30000"}));
        
        assertTrue(control.forwardData(new String[]{"recursive", "8430"}));
        
    }
}
