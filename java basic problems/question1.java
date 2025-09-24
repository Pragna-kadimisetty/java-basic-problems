//question 1.Addition of two numbers
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1=scanner.nextInt();
        System.out.println("Enter second number:");
        int num2=scanner.nextInt();
        int sum=num1+num2;
        System.out.println("The sum of two numbers is:"+sum);
        scanner.close();
        
    }
}