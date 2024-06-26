package self;
import java.util.Scanner;
public class elseif {
    public static void main(String[] args) {
        int age ;
        System.out.println("Enter your age for prediction:");
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();
        if (age > 35){
            System.out.println("you r experienced");
        }
        else if(age >25) {
            System.out.println("u r semi- experienced1");
        }
        else if(age >16){
                System.out.println("u r fresher");
        }
        else {
            System.out.println("u r child ");
        }
    }
}
