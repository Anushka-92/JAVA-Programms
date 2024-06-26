package self;
import java.util.Scanner;
public class sum_of_2_numbers{
    public static void main(String[] args) {
        System.out.println("enter first number:");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();

        System.out.println("Enter second number:");
        int b= sc.nextInt();

        int sum = (a+b);
        System.out.println("sum of 2 numbers:");
        System.out.println(sum);
    }
}

