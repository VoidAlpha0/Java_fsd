package test2;

public class Practice_Project4 {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        int index = 5;

        try {
            int result = numbers[index];
            System.out.println("Value at index " + index + ": " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds");
        }

        System.out.println("Array size is " + numbers.length);
    }
}
