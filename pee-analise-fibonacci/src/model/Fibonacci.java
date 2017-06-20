/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.math.BigInteger;

/**
 *
 * @author Admin
 */
public class Fibonacci {

    private BigInteger[] memory;

    public Fibonacci() {

        this.memory = null;

    }

    public Fibonacci(int n) {

        this.memory = new BigInteger[n + 1];

    }

    public BigInteger iterativo(int n) {

        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;

        if (n < 2) {
            return a;
        }

        BigInteger c = null;

        while (n-- >= 2) {
            c = a.add(b);
            a = b;
            b = c;
            //System.out.println(c);
        }

        return c;
        
    }

    public BigInteger recursivo(int n) {
        
        if (n < 2) {
            return BigInteger.ONE;
        }

        if (memory[n] != null) {
            return memory[n];
        }

        memory[n] = recursivo(n - 1).add(recursivo(n - 2));
        
        //System.out.println(memory[n]);
        
        return memory[n];
        
    }

    public BigInteger[] getMemory() {
        return memory;
    }

    public void setMemory(BigInteger[] memory) {
        this.memory = memory;
    }

}
