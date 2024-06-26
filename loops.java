package self;
import java.util.Scanner;
  public class loops {
     public static void main(String[] args) {
       //  while loop
//        int i=1;// printing 200 to 100 no.s
//        System. out.println("using while loop printing 1 to 5 as below:");
//        while (i<=5) {
//            System.out.println(i);
//            i++;
//        }
//        System.out.println("ending at 5 here");

//        while (true) {
//            System.out.println("it is infinite loop");
//            }

//          // Do-while loop
//        int b=10;
//        do{
//            System.out.println(b);
//            b++;
//        }while(b<15);


        // For loop
//        for(int i=1; i<=10; i++){
//            System.out.println(i);
//        }


//       // to print odd no. in loop using for
//        int n;
//       System.out.println("enter n no.to find first");
//       Scanner sc= new Scanner(System.in);
//        n = sc.nextInt();
//        System.out.println( "odd numbers are as follows:");
//        for(int i=0;i<n ; i++) {
//            System.out.println(2 * i + 1);
//        }

//        //Printing first n numbers in reverse order
        System.out.println("Enter value of n to find that much no. in reverse order:");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
         System.out.println(" The first "+ n +" number in reverse order are as follows:");
        for (int i = n; i>0 ; i--) {
            System.out.println(i);
        }
    }
}