package self;
public class MethodOverloading {
    static  void  change2(int [] arr){
         arr[0]=98;
    }
    static void change (int c){
        c=98;
    }
    static void tellJoke(){
       System.out.println(" I invented a word !\n" +
               "Plagarism!");
   }
   static void foo() {
       System.out.println("good morning bro!");
   }
    static void foo(int a) {
        System.out.println("good morning " +  a + " bro!");
    }
    static void foo(int a,int b) {
        System.out.println("good morning " + a + " bro!");
        System.out.println("good morning " + b + " bro!");
    }
    public static void main(String[] args) {
//         //case 1: Changing the Integer
//        int [] marks ={52,73,77,89,98,94};
//        int x= 45;
//        change(x);
//        System.out.println("The value of x after running change is :" + x);
         //case 2: Changing the Array

        int [] marks ={52,73,77,89,98,94};
        change2(marks);
        System.out.println("The value of x after running change is :" + marks[5]);

//         Method overloading
//        Arguments are actual!!.
        foo();
        foo(3);
        foo(3000, 4000);
    }
}