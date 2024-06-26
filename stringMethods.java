package self;

public class stringMethods {
    public static void main(String[] args) {
        String name="ANushKA";
//        System.out.println(name);
//        //printing legth of string
//        int value= name.length();
//        System.out.println(value);
//
//        //Lowercase and uppercasing of name
//        String lstring = name.toLowerCase();
//        System.out.println(lstring);
//        String ustring = name.toUpperCase();
//        System.out.println(ustring);
//
//        String nonTrimmedString ="        Anushka      ";
//        System.out.println(nonTrimmedString);
//        String trimmedString;
//        System.out.println(nonTrimmedString.trim());// it will cutout all unnecessary spaces before string
//        System.out.println( name.substring(1)); //cutting and printing string from index 1 of name
//        System.out.println( name.substring(1,4)); //excludes last index character & includes 1st one.

//        System.out.println(name.replace('N','m'));// n from name is replaced by m
//        System.out.println(name.replace("A","archana"));//a chya jagi archana print hoil
//        System.out.println(name.startsWith("anu"));//returns true jrr asel khaar tr
//        System.out.println(name.startsWith("ANu"));
//        System.out.println(name.endsWith("ka"));
//        System.out.println(name.charAt(2));// 2 index vrcha character print krtay
//        System.out.println(name.indexOf("s"));// s cha index print hoto

        String modified = "Anuuuuushka";
        System.out.println(name.indexOf("shKA"));//s cha index print honar
        System.out.println(name.indexOf("h",4));//
        System.out.println(name.lastIndexOf("k  "));
        System.out.println(name.equals("abhiman"));//boolean value
        System.out.println(name.equalsIgnoreCase("anushka"));//case ignore elyas eqal hoto ka bght
    }

}
