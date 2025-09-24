//11.Palindrome number
import java.util.Scanner;
public class question11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }

        scanner.close();
    }
}
// import java.util.*;

// public class Question11 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         String num = sc.next();  // take number as string
//         String rev = new StringBuilder(num).reverse().toString();
        
//         System.out.println(num.equals(rev) ? num + " is a palindrome." : num + " is not a palindrome.");
//         sc.close();
//     }
// }
