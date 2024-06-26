package self;
import java.io.*;
public class exception_hndling {
//    public static void example() throws ArithmeticException {
//        int result = 36/0;
//    }
       public static void example() {
           throw new ArithmeticException("divide by 0");
      }
    public static void main(String[] args) {
//        int a=5;
//        int b=0;
//        try{
//            System.out.println(a/b);
//        }
//        catch (ArithmeticException e){
//        //    e.printStackTrace();
//         //   System.out.println(e.toString());
//            System.out.println(e.getMessage());
// -------------Try catch---------
//        try{
//            int result = 36/0;
//        }catch(ArithmeticException e){
//            System.out.println("Error" + e.getMessage());
//        }
// -----------Multiple catch ------------
//        try{
//            int result = 36/0;
//        }catch (ArithmeticException e1){
//            System.out.println("Error: "+ e1.getMessage());
//        }catch (NullPointerException e2){
//            System.out.println("Error: " + e2.getMessage());
//        }
//------------try finally --------------
//        try{
//            int result =36/0;
//        }finally {
//            int result = 36/6;
//            System.out.println("Finally block result: "+ result);
//        }
// ------------try catch finally-----------
//        try{
//            int result =36/0;
//        }catch(ArithmeticException e){
//            System.out.println("Error: "+ e.getMessage());
//        }finally {
//            int result = 36/6;
//            System.out.println("Finally block result: "+ result);
//        }
//-----------throws--------------------
//                try {
//                    example();
//                } catch (ArithmeticException e) {
//                    System.out.println(e);
//                }
//-----------throw-----------------
            example();
        }
    }




