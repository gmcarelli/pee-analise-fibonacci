/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import service.Service;

/**
 *
 * @author workstation
 */
public class Control {

    private final Service service = new Service();

    public boolean forwardData(String[] args) throws Exception {

        boolean result = false;

        if (!hasValidParam(args)) {

            help(args);

        } else {

            result = service.performTest(args[0], args[1]);

        }

        return result;
    }

    /**
     * Checks input parameters
     *
     * @param args is a set of input parameters
     * @return true if input parameters are valid and false otherwise
     */
    private boolean hasValidParam(String[] args) {

        boolean result = false;

        if (args.length > 0) {

            result |= args.length == 2 && args[0].matches("(iterative|recursive)") && Integer.parseInt(args[1]) > 0;

        }

        return result;
    }

    /**
     * Prints a help message
     */
    private String help(String args[]) {

        final String VERSION = "1.0";

        StringBuilder sb = new StringBuilder();

        if (args.length <= 1 || args[0].matches("(\\-v|\\-\\-version)")) {
            sb.append(System.getProperty("line.separator")).append(VERSION)
                    .append(System.getProperty("line.separator"));
        }

        sb.append("Performance Analysis of iterative and recursive algorithms to calculate Fibonacci's Sequel.")
                .append(System.getProperty("line.separator")).append(System.getProperty("line.separator"));

        sb.append("DESCRIPTION").append(System.getProperty("line.separator"))
                .append("The algorithm is capable of calculate ")
                .append("Fibonacci's Sequel in both interative ")
                .append("and recursive ways.")
                .append(System.getProperty("line.separator")).append(System.getProperty("line.separator"));

        sb.append("USAGE").append(System.getProperty("line.separator")).append(System.getProperty("line.separator"))
                .append("java -jar pee-analise-fibonacci.jar <algorithm type> <sequel size>")
                .append(System.getProperty("line.separator")).append("   ")
                .append("<algorithm type> could be \"iterative\", or \"recursive\" (String)")
                .append(System.getProperty("line.separator")).append("   ")
                .append("<sequel size> the size of the sequel to be calculated. (String)")
                .append(System.getProperty("line.separator")).append("   ");

        sb.append("QUESTIONS OR BUG REPORTS").append(System.getProperty("line.separator"))
                .append(System.getProperty("line.separator"))
                .append("https://github.com/gmcarelli/pee-analise-fibonacci/issues")
                .append(System.getProperty("line.separator")).append(System.getProperty("line.separator"));

        sb.append("VERSION").append(System.getProperty("line.separator"))
                .append(System.getProperty("line.separator")).append(VERSION);

        System.out.println(sb.toString());

        return sb.toString();
    }
}
