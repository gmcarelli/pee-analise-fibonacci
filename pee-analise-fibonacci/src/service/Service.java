/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import model.Fibonacci;

/**
 *
 * @author workstation
 */
public class Service {

    private Fibonacci fibonacci = new Fibonacci();

    public boolean performTest(String arg0, String arg1) {

        boolean result = false;

        switch (arg0) {
            case "iterative":
                fibonacci = new Fibonacci();
                fibonacci.iterativo(Integer.parseInt(arg1));
                result = true;
                break;
            case "recursive":
                int n = Integer.parseInt(arg1);
                fibonacci = new Fibonacci(n);
                fibonacci.recursivo(n);
                result = true;
                break;
            default:
                result = false;
                break;
        }

        return result;

    }

}
