//7.Factorial of a number
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=scanner.nextInt();
        int factorial=1;
        for(int i=1;i<=num;i++){
            factorial=factorial*i;
        }
        System.out.println("The factorial of "+num+" is:"+factorial);
        scanner.close();
    }
}