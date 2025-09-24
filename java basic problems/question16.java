//16.Count number of digits
import java.util.Scanner;
public class question16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to count its digits: ");
        int num = sc.nextInt();
        int count = 0;

        if (num == 0) {
            count = 1; // Special case for 0
        } else {
            while (num != 0) {
                num /= 10; // Remove the last digit
                count++;
            }
        }

        System.out.println("Number of digits: " + count);
        sc.close();
    }