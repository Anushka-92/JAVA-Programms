package self;

public class VarArgs {
    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b,int c){
        return a+b+c;
    }
    static int sum(int a, int b,int c,int d){
        return a+b+c+d;
    }
//    static int sum(int...arr){
//    // Availabe as int[] arr;
//        int result =0;
//        for(int a:arr){
//            result +=a;
//        }
//        return result;
    //}
    public static void main(String[] args) {
        System.out.println(" Welcome to varargs tutorials");
        System.out.println("sum of 4 & 5 is " +  sum(4,5));
        System.out.println("sum is " +  sum(4,5,6));
        System.out.println("sum is " +  sum(4,5,6,7));
        //System.out.println("sum  is " +  sum(4,5,6,7,1));
    }
}
