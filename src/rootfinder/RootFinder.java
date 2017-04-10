/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rootfinder;

import java.util.Scanner;

/**
 *
 * @author Hailey.Jones
 */
public class RootFinder {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number that will be square rooted.");
        double number = scan.nextInt();

        String x = "0";
        String y = "1";
        boolean run = true;
        DecimalFormat format = new DecimalFormat("#.0000000000");
        double guess = 1;
        double result;

        while (run) {

            result = root(number, guess);
            System.out.println(format.format(result));

            guess = result;
            y = x;
            x = format.format(result);
            if (x.equals(y)) {
                run = false;
            } else {
                run = true;
            }
        }
        
        System.out.println("The square root of "+ number +" is " + x);
        
    }

    public static double root(double number, double guess) {
        double result = guess - (0.5 * (guess - number / guess));
        return result;
    }

}


