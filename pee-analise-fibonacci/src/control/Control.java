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

        try {
            
            Integer.parseInt(args[1]);
            
        } catch (NumberFormatException e) {
            
            throw new NumberFormatException("The second argument MUST be an Integer > 0");
            
            
        } 
        
        if (args.length > 0) {

            result |= args.length == 2 && args[0].matches("(iterative|recursive)");

        }

        return result;
    }

    /**
     * Prints a help message
     */
    private String help(String args[]) {

        final String VERSION = "1.0";

        StringBuilder sb = new StringBuilder();

        if (args.length == 1 && args[0].matches("(\\-v|\\-\\-version)")) {
            sb.append(System.getProperty("line.separator")).append(VERSION)
                    .append(System.getProperty("line.separator"));
        } else {

            sb.append("Performance Analysis of Databases for Persistence and Retrievement of Medical Images")
                    .append(System.getProperty("line.separator")).append(System.getProperty("line.separator"));

            sb.append("DESCRIPTION").append(System.getProperty("line.separator"))
                    .append(System.getProperty("line.separator")).append("Performance analysis of ")
                    .append("persistence and retrievement of medical images on ")
                    .append("relational and non-relational database systems")
                    .append(System.getProperty("line.separator")).append(System.getProperty("line.separator"));

            sb.append("USAGE").append(System.getProperty("line.separator")).append(System.getProperty("line.separator"))
                    .append("java -jar medical.jar <database-system> <database-name> <username> <password> <operation-params>")
                    .append(System.getProperty("line.separator")).append("   ")
                    .append("<database-system> could be \"mongo\", \"neo4j\", or \"pgsql\" (String)")
                    .append(System.getProperty("line.separator")).append("   ")
                    .append("<database-name> is the schema or collection name (String)")
                    .append(System.getProperty("line.separator")).append("   ")
                    .append("<username> is the username to access the database system (String)")
                    .append(System.getProperty("line.separator")).append("   ")
                    .append("<password> is the password to access the database system (String)")
                    .append(System.getProperty("line.separator")).append("   ")
                    .append("<operation-params> is defined as {-p (<image-id> <image-name> <image-path>)+ | -r (<image-id>)+}")
                    .append(System.getProperty("line.separator")).append("   ").append("   ")
                    .append("<image-id> is the identification code (exclusive numbers) of the image (Long)")
                    .append(System.getProperty("line.separator")).append("   ").append("   ")
                    .append("<image-name> is the image name to be persisted (String)")
                    .append(System.getProperty("line.separator")).append("   ").append("   ")
                    .append("<image-path> is the complete path to access the image to be persisted (TIFF)")
                    .append(System.getProperty("line.separator")).append(System.getProperty("line.separator"));

            sb.append("QUESTIONS OR BUG REPORTS").append(System.getProperty("line.separator"))
                    .append(System.getProperty("line.separator"))
                    .append("https://github.com/gmcarelli/medical-database-analysis/issues")
                    .append(System.getProperty("line.separator")).append(System.getProperty("line.separator"));

            sb.append("VERSION").append(System.getProperty("line.separator"))
                    .append(System.getProperty("line.separator")).append(VERSION);
        }

        System.out.println(sb.toString());

        return sb.toString();
    }
}
