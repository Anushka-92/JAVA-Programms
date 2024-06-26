package self;
public class logical_operators {
    public static void main(String[] args) {
        System.out.println("For logical and");
        boolean a= true;//1
        boolean b= false;//0
        boolean c= false;//0
//        if(a && b && c) { //Associativity is from left to right of &&....1&&0&&0= 0&&0= 0
//            System.out.println("y");
//        }
//        else {
//                System.out.println("N");
//            }
        System.out.println("for logical or ");
        if(c||b){   //0||0 =0
            System.out.println("y");
        }
        else{
            System.out.println("N");
        }
        System.out.println("For logical not ");
        System.out.println("Not(a) is ");//!1=0
        System.out.println(!a);
        System.out.println("Not(b) is ");//!0=1
        System.out.println(!b);

    }

}
