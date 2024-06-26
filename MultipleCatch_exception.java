package self;
public class MultipleCatch_exception {
    public static void main(String[] args) {
        try {
            int result = 5/0;
        } catch(NullPointerException e1) {
            System.out.println("Error: " + e1.getMessage());
        } catch (ArithmeticException e2) {
            System.out.println("Error: " + e2.getMessage());
        }
    }
}
