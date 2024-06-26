package self;
import java.util.Scanner;
public class percentage {
    public static void main(String[] args) {
        System.out.println("Enter marks of sub1:");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();

        System.out.println("Enter marks of sub2:");
        int b= sc.nextInt();

        System.out.println("Enter marks of sub3:");
        int c= sc.nextInt();

        System.out.println("Enter marks of sub4:");
        int d= sc.nextInt();

        System.out.println("Enter marks of sub5:");
        int e= sc.nextInt();

        float per=(a+b+c+d+e)/5.0f;
        System.out.println("the percentage is : ");
        System.out.println(per);

    }
}
