package self;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        int age; // at age place we can use integer, char, string in java.
        System.out.println("Enter ur age for prediction:");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        switch (age) {
            case 18:
                System.out.println("u r becoming an adult");
                break;
            case 23:
                System.out.println(" u r going to get an job soon");
                break;
            case 35:
                System.out.println("u r setteled now");
                break;
            default:
                System.out.println("u  will do something from above");
                break;
        }
    }
}