package test2;

public class Practice_Project5 {
    public static void main(String[] args) {
        try {
            divide(10, 0);
        } catch (custExp e) {
            System.out.println("Caught CustomException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }

    public static int divide(int dividend, int divisor) throws custExp {
        try {
            if (divisor == 0) {
                throw new custExp("Divisor cannot be zero");
            } else {
                return dividend / divisor;
            }
        } catch (ArithmeticException e) {
            throw new custExp("Error occurred during division", e);
        }
    }
}

class custExp extends Exception {
    public custExp(String message) {
        super(message);
    }

    public custExp(String message, Throwable cause) {
        super(message, cause);
    }
}
