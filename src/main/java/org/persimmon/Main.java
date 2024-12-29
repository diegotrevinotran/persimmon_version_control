package org.persimmon;

/**
 * Top-level class for Persimmon.
 */
public class Main {
    /**
     * Parses the provided command (as system arguments) and performs the necessary tasks.
     * @param args the command to execute, of the form [COMMAND] [PARAMETER_1] [...]
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Must enter a command.");
        }
        else {
            switch (args[0]) {
                case "init": {

                }
            }
        }
    }
}