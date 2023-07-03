package test3;

public class practice_project1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int rotateSteps = 5;
        
        System.out.println("Original Array:");
        printArray(arr);
        
        rightRotateArray(arr, rotateSteps);
        
        System.out.println("Array after right rotation:");
        printArray(arr);
    }
    
    public static void rightRotateArray(int[] arr, int rotateSteps) {
        int length = arr.length;
        rotateSteps = rotateSteps % length; // Adjusting the number of steps
        
        reverseArray(arr, 0, length - 1);
        reverseArray(arr, 0, rotateSteps - 1);
        reverseArray(arr, rotateSteps, length - 1);
    }
    
    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
