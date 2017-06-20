/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import control.Control;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {

        try {

            Control control = new Control();

            boolean aux = control.forwardData(args);

            if (aux) {

                System.out.println("Success!");

            } else {

                System.out.println("Epic fail!");

            }

        } catch (Exception e) {

            e.getMessage();

        }

    }

}
