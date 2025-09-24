//20.Print numbers in reverse order
import java.util.Scanner;
public class question20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number N: ");
        int N = sc.nextInt();
        System.out.println("The numbers from " + N + " to 1 in reverse order are:");
        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
