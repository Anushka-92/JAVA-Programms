package self;
import java.util.Scanner;
public class CWH_05_TakingInpu {
    public static void main(String[] args) {
        System.out.println("Taking Input From the User");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        float d = sc.nextFloat();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        float c = sc.nextFloat();

        int sum = a +b;
        float sum2 = c +d;
        System.out.println("The sum of these numbers is");
        System.out.println(sum);
        System.out.println(sum2);
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
        String str = sc.next();
        String str2 = sc.nextLine();
        System.out.println(str);

    }
}
