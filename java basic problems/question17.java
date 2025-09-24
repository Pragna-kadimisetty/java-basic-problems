//17.Check positive, negative, zero
import java.util.Scanner;
public class question17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it's positive, negative, or zero: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println(num + " is a positive number.");
        } else if (num < 0) {
            System.out.println(num + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }
        sc.close();
    }
}