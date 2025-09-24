//23.Print all prime numbers between 1 to N
import java.util.Scanner;
public class question23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number N: ");
        int N = sc.nextInt();
        System.out.println("Prime numbers between 1 and " + N + " are:");
        for (int num = 2; num <= N; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
        sc.close();
    }