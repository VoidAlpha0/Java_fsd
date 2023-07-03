package test4;

import java.util.Scanner;

public class practiceProject2 {
    public static int binarySearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == key) {
                return mid; 
            } else if (array[mid] < key) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        int[] array = {5, 10, 15, 20, 25, 30};
        int key ;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the elemenet to search ");
        key=sc.nextInt();

        int index = binarySearch(array, key);
        if (index != -1) {
            System.out.println("Element " + key + " found at index " + index);
        } else {
            System.out.println("Element " + key + " not found in the array");
        }
        sc.close();
    }
}
