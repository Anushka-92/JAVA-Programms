package self;
import java.util.Scanner;
public class operaterPrecedence {
    public static void main(String[] args) {


        System.out.println("Enter value of a:");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println("Enter value of b:");
        int b=sc.nextInt();
        int k = b*b - (4*a*b)/(2*a);//64-(160)/(10).....* then () then / then -
        System.out.println("The value of k is:");
        System.out.println(k);
        int c= 21/7*4+5-2; ///left to right associativity.
        System.out.println("The value of c is:");
        System.out.println(c);
    }
}

