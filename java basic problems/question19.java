//19.Sum of first N natural numbers
import java.util.Scanner;
public class question19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number N: ");
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.println("The sum of the first " + N + " natural numbers is: " + sum);
        sc.close();
    }