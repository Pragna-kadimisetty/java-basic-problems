//8.Fibonacci series
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=scanner.nextInt();
        int a=0,b=1;
        System.out.print("Fibonacci series up to "+num+" terms: ");
        for(int i=1;i<=num;i++){
            System.out.print(a+" ");
            int next=a+b;
            a=b;
            b=next;
        }
        scanner.close();
    }
}