
package f17sept26;

import java.util.Scanner;

/**
 *
 * @author JWright
 */
public class F17Sept26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.print("Please enter a number: ");
        Scanner keyboard = new Scanner(System.in);
        
        int userNum = keyboard.nextInt();
        
        if (userNum < 10)
            System.out.printf("That is a small number%n");
        else
            System.out.printf("That is a nice number%n");
    }   
}
