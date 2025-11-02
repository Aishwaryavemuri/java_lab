public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int a = 1, b = 0;
            int c = a / b; 
            System.out.println("Result: " + c);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error");
        } 
        finally {
            System.out.println("completed");
        }
    }
}