public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {

            String str = null;
            System.out.println("Length of string: " + str.length()); 
            
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed after NullPointerException handling.");
        }

        try {

            int[] arr = {1, 2, 3};
            System.out.println("Accessing index 5: " + arr[5]); 
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed after ArrayIndexOutOfBoundsException handling.");
        }

        System.out.println("Program execution continues normally...");
    }
}

