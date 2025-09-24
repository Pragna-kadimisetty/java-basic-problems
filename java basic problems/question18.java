//18.Print alphabets (A–Z)
import java.util.Scanner;
public class question18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character to print alphabets from A to Z: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Alphabets from " + ch + " to Z:");
            for (char c = ch; c <= 'Z'; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        } else {
            System.out.println("Please enter a valid uppercase letter (A-Z).");
        }
        sc.close();
    }