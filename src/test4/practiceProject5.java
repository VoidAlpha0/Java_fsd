package test4;

public class practiceProject5 {
    public static void bubbleSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Original Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        bubbleSort(array);

        System.out.println("\nSorted Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
