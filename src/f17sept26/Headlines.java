package f17sept26;

import java.util.Scanner;

/**
 *
 * @author JWright
 */
public class Headlines {
    public static void main(String[] args)
    {
        System.out.print("What is the world news headline today?");
        Scanner bananaPhone = new Scanner(System.in);
        String worldNews = bananaPhone.nextLine();
        System.out.printf("The world news headline is %s%n", worldNews);
        
        System.out.print("What is the sports headline today?");
        String sports = bananaPhone.nextLine();
        System.out.printf("The sports headline is %s%n", sports);
        
        System.out.print("What is the politics headline today?");
        String politics = bananaPhone.nextLine();
        System.out.printf("The politics headline is %s%n", politics);
        
        System.out.print("What is the weather headline today?");
        String weather = bananaPhone.nextLine();
        System.out.printf("The weather headline is %s%n", weather);

    }
}
