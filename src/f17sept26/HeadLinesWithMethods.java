package f17sept26;

import java.util.Scanner;

/**
 *
 * @author JWright
 */
public class HeadLinesWithMethods {
    public static void main(String[] args)
    {
        
    }
    
    public static String getHeadline(String subject)
    {
        System.out.printf("What is the %s headline today?", subject);
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextLine();
    }
}
