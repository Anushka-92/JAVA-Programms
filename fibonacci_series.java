package self;
//Without recursion
//public class fibonacci_series {
//    public static void main(String[] args) {
//        int n1 = 0, n2 = 1, n3, i, n = 10;
//        System.out.print(n1 + " " + n2);
//        for (i = 2; i < n; ++i) {
//            n3 = n2 + n1;
//            System.out.print(" " + n3);
//            n1 = n2;
//            n2 = n3;
//        }
//    }
//}
//With recursion
public class fibonacci_series {
    static int a0 = 0, a=1, count=10, b=1,c,n3=0;
    static void fc(int count) {
        if (count > 0) {
            n3 =a+b;
            a = b;
            b = n3;
            System.out.print(" " + n3);
            fc(count-1);
        }
    }
    public static void main(String[] args) {
        System.out.print(a0 +" "+ a +" "+ b);
        fc(count-2);
  }
}
