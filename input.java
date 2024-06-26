package self;
import java.util.Scanner;
 public class input {
    public static void main(String[] args) {
        System.out.println("taking input from user:");
        Scanner sc= new Scanner(System.in);
        System.out.println("enter 1st digit:");
        //int a= sc.nextInt();
        float b=sc.nextFloat();
        System.out.println("enter 2 nd digit:");
        //int b= sc.nextInt();
        float d=sc.nextFloat();
        float sum= d+b;
        float product = d*b;
        System.out.println("sum of 1st no.s are:");
        System.out.println(sum);
        System.out.println("product of 2 numbers are:");
        System.out.println(product);

    }

}
