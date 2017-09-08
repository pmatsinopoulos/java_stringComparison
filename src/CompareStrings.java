import java.util.Scanner;

/**
 * Asks user for two strings and prints whether they are equal or not.
 * 
 * @author panayotismatsinopoulos
 *
 */
public class CompareStrings {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Give me one string: ");
        String string1 = scanner.next();
        
        System.out.print("Give me another string: ");
        String string2 = scanner.next();
        
        System.out.println(string1.equals(string2) ? "equal" : "not equal");
        
        scanner.close();
        
    }
}
