package self;
public class Methods {
//    static int logic(int x, int y) {
//        int z;
//        if (x > y) {
//            z = x + y;
//        } else {
//            z = (x + y) * 5;
//        }
//        return z;
//    }
//    public static void main(String[] args) {
//        int a = 5;
//        int b = 7;
//        int c;
//        c = logic(a, b);
//
//        int a1 = 2;
//        int b1 = 1;
//        int c1;
//        c1 = logic(a1, b1);
//        System.out.println(c);
//        System.out.println(c1);
//    }
//}
//
//
    //method invocation using object creation
    int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        Methods obj1 = new Methods();
        c = obj1.logic(a, b);

        int a1 = 2;
        int b1 = 1;
        int c1;
        Methods obj = new Methods();
        c1 = obj.logic(a1, b1);
        System.out.println(c);
       System.out.println(c1);
    }
}




