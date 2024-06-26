package self;
import java.util.*;
public class Pattern {
    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//        if (age>19){
//            System.out.println("you are adult");
//        }else{
//            System.out.println("no u r not adult!!!");
//        }
//-----------------------------------------------------------------------------------
//        Scanner sc = new Scanner(System.in);
//        int x= sc.nextInt();
//        if(x < 0){
//            System.out.println("Enter positive no.");
//        }else if(x%2 == 0){
//            System.out.println("It is an even no.");
//        } else{
//            System.out.println( "it is an odd no.");
//        }
//-----------------------------------------------------------------------------------------
//        Scanner sc = new Scanner(System.in);
//        int x= sc.nextInt();
//        int y = sc.nextInt();
//        if (x==y){
//            System.out.println("Both are same");
//        }else if (x>y){
//            System.out.println("1st no is greater than second");
//        }else{
//            System.out.println("second no is greater than first");
//        }

        //--------------------------------------------------------------------------------------------
//        Scanner sc = new Scanner(System.in);
//        int button = sc.nextInt();
//        switch (button){
//            case 1:
//                System.out.println("Hello");
//            break;
//            case 2:
//                System.out.println("hii");
//                break;
//            default:
//                System.out.println("Invalid choice of button");
//        }
// ---------------------------------------------------------------------------------------------------------
//        for (int i = 0; i<=5; i++){
//            System.out.print(i+ " ");
//        }
//        for (int i = 0; i<=5; i++){
//            System.out.println(i);
//        }
        //---------------------------------------------------------------------------------------------
//        int i =0;
//        while(i < 11){
//            System.out.println(i);
//          //  i= i+1;
//           // i+=1;
//        }
        //---------------------------------------------------------------------
//        int i = 0;
//        do {
//            System.out.println(i);
//            i+=1;
//        }while(i < 11) ;
// --------------------------------------------------------------------------
//        Scanner sc = new Scanner(System.in);
//        int n= sc.nextInt();
//        int sum =0;
//        for(int i=0; i<=n;i++){
//            sum= sum+i;
//        }
//        System.out.println(sum);
//
//        }
        //--------------------------------------------------------------------------
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Multiplication table for number :");
//        int n = sc.nextInt();
//        for (int i = 1; i <=10; i++) {
// //          System.out.println(n * i);
//        System.out.printf("%d X %d= %d\n", n, i, n * i);
//        }
 //--------------------------Solid rectangle-----------------------------------------------
//int n= 4;
//int m= 5;
////outer loop
//    for (int i =1; i<=n; i++){
//        //inner loop
//      for(int j=1; j<m; j++){
//          System.out.print("*");
//      }
//        System.out.println();
//    }
 //----------------HOLLOW RECTANGLE-------------------------------------------
//        int n=4;
//        int m= 5;
//        //outer loop
//        for (int i=1; i<=n; i++){
//            //inner loop
//            for(int j=1; j<=m; j++){
//                //cell ->(i,j)
//                if(i == 1 || i==n || j==1 || j==m ){
//                    System.out.print("*");
//                } else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//----------Half pyramid-------------------------------------------------
//        int n= 4;
//        for(int i=1; i<=n;i++){
//            //inner loop
//            for(int j=1; j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//------------------Inverted half pyramid-----------------------------------
//        int n =4;
//        for(int i=n; i>=1;i--){
//            //inner loop
//            for(int j=1; j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
 //----------------Inverted half pyramid(180 rotated)---------------------------------
//        int n=4;
//        for (int i = 1; i<=n;i++){
//            //for space printing
//            for (int k =0;k<=n-i;k++){
//                System.out.print(" ");
//            }
//            //for star printing
//            for(int j = 1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
   //-----------------Half pyramid with numbers---------------------------------
//        int n= 4;
//        for(int i=1; i<=n; i++){
//            for(int j= 1; j<=i;j++){
//                System.out.print(j+ " ");
//            }
//            System.out.println();
//        }
        //-----------------Inverted Half pyramid with numbers---------------------------------
//int n= 5;
//for(int i=1;i<=n;i++){
//    for(int j=1; j<=n-i+1;j++){
//        System.out.print("*");
//        }
//        System.out.println();
//    }
  //---------------------Floud's triangle-----------------------------------------------------
//        int n=5;
//        int num=1;
//        for (int i=1;i<=n;i++){
//            for(int j=1; j<=i;j++){
//                System.out.print(num+" ");
//                num++;
//            }
//            System.out.println();
//        }
  //-------------------0-1 Triangle-------------------------------------------------------------
//        int n= 5;
//        //outer loop
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=i; j++){
//                int sum =i+j;
//                if(sum % 2 == 0){
//                   System.out.print("1 ");
//                }else{
//                   System.out.print("0 ");
//                }
//            }
//            System.out.println();
//        }
  //--------------------------------Butterfly pattern----------------------------
        int n= 5;
        //Printing first- Upper half
    for(int i=1; i<=n; i++){
        //1st part star printing
        for( int j=1 ; j<=i; j++){
            System.out.print("*");
        }
        int spaces = 2 * (n-i);
        for( int j=1; j<=spaces; j++){
            System.out.print(" ");
        }
        //2nd part
        for(int j=i; j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }

    }
}
