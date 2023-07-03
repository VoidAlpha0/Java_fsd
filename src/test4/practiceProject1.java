package test4;

import java.util.Scanner;

public class practiceProject1 {
    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
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

        int index = linearSearch(array, key);
        if (index != -1) {
            System.out.println("Element " + key + " found at index " + index);
        } else {
            System.out.println("Element " + key + " not found in the array");
        }
        sc.close();
    }
}
