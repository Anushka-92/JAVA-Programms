package self;
import java.util.Scanner;
public class Practice_switch {
    public static void main(String[] args) {
        // Q.2
//        byte m1, m2, m3;
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter ur phy marks");
//        m1=sc.nextByte();
//
//        System.out.println("Enter ur che marks");
//        m2=sc.nextByte();
//
//        System.out.println("Enter ur m1 marks");
//        m3=sc.nextByte();
//        float avg= (m1+m2+m3)/3.0f;
//        System.out.println("ur overall % is");
//        if(avg>=40 && m1>=45 && m2>=45 && m3>=45){
//            System.out.println("congratulations, u are brilient");
//        }
//        else{
//            System.out.println("sorry u r not brelient ");


//        //Q.3income tax
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter your income in lacs per annum :");
//        float tax = 0;
//        float income=sc.nextFloat();
//        if(income<=2.5f) {
//            tax = tax + 0;
//        }
//        else if(income>=2.5f && income<=5f) {
//            tax = tax + 0.05f * (income-2.5f);
//        }
//        else if(income>=5f && income<=10f) {
//            tax= tax + 0.05f * (5.0f-2.5f);
//            tax = tax + 0.2f * (income- 5f);
//        }
//        else if(income>=10f){
//            tax= tax + 0.05f * (5.0f-2.5f);
//            tax= tax + 0.2f * (10.0f-5f);
//            tax = tax + 0.3f * (income-10.0f);
//        }
//        System.out.println("Total tax paid by the employee is :"+tax);

        //Q.4 (to find day of week
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter a no. to find day on that date:");
//        int day =sc.nextInt();
//        switch (day){
//            case 1:
//                System.out.println("Monday");
//                break;
//
//           case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Thursday");
//                break;
//            case 4:
//                System.out.println("Friday");
//                break;
//            case 5:
//                System.out.println("saturday");
//                break;
//            case 6:
//                System.out.println("Sunday");
//                break;

//                //Q.5 (leap yr or not)
//            Scanner sc= new Scanner(System.in);
//            System.out.println("Enter year to check it is leap or not: ");
//            int year = sc.nextInt();
//            boolean leap = false;
//
//        // if the year is divided by 4
//           if (year % 4 == 0) {
//
//            // if the year is century
//            if (year % 100 == 0) {
//
//                // if year is divided by 400
//                // then it is a leap year
//                if (year % 400 == 0)
//                    leap = true;
//                else
//                    leap = false;
//            }
//
//            // if the year is not century
//            else
//                leap = true;
//            }
//
//            else
//               leap = false;
//
//            if (leap)
//               System.out.println(year + " is a leap year.");
//            else
//               System.out.println(year + " is not a leap year.");

    //Q.6( t find type of url website)
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if(website.endsWith(".org")){
            System.out.println("This is an organizational website");
        }
        else if(website.endsWith(".com")) {
            System.out.println("This is an commercial website");
        }
        else if(website.endsWith(".in")){
                System.out.println(" this is an indian website");
        }
    }

}

