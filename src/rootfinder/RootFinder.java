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
        
        boolean run = true;
        
        while(run){
        for(int i  = 0; i <20; i++){
        double result = 0.5 * (number - 2/number);
        System.out.println(result);
        
        }
        
        run = false;
        
        }
        
        
        
    }
    
}