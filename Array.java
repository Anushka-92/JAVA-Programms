package self;
  public class Array {
    public static void main(String[] args) {
//       // 1st way of creating an array in java(declaration+memory allocation)
//       int [ ] marks = new int[5];
//        marks[0]=80;
//        marks[1]=60;
//        marks[2]=83;
//        marks[3]=84;
//        marks[4]=88;
//      //  marks[5]=89;    it throws an error
//        System.out.println(marks[4]);


        // 2nd way of creating an array in java( declaration then memory allocation then initialization)
//        int[] marks;
//        marks = new int [5];
//        marks[0]=80;
//        marks[1]=60;
//        marks[2]=83;
//        marks[3]=84;
//        marks[4]=88;
//        System.out.println(marks[4]);


//        // 3rd way of creating array in java (declaration + memory allocation + initialization all together)
//        int [] marks = { 80,60,83,84,88};
//        System.out.println(marks[3]);
//        System.out.println(marks.length);


       //  with different data-types
       float [] marks = { 80.9f,60.5f,83.6f,84.2f,88.9f};
//        System.out.println(marks[2]);
//        String [] names = { "Anushka", "Riya", "Anurag", "Aai","Baba"};
//        System.out.println(names[1]);


//      // Displaying array (for loop)  // array traversal
//      System.out.println("printing using for loop ");
//       for (int i=0; i<marks.length; i++){
//         System.out.println(marks[i]);
//     }


//        // Displaying array in reverse order (for loop)  // array traversal
//           System.out.println("printing using for loop in reverce order");
//          for (int i =(marks.length -1); i>=0; i--) {
//              System.out.println(marks[i]);
//          }
       /*For each loop is an enhanced version of for loop.
      It travels each element of the data structure one by one.
     Note that you can not skip any element in for loop and it is also not possible to traverse elements in reverse order with the help of for each loop.
      It increases the readability of the code.
     If you just want to simply traverse an array from start to end then it is recommended to use for each loop.*/

         //Displaying array (for each loop)  // array traversal
        System.out.println("printing using for-each loop ");
        for ( float element : marks){
            System.out.println(element);
        }
    }
}
