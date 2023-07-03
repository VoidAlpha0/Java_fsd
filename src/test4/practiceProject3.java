package test4;

import java.util.Arrays;
import java.util.Scanner;

public class practiceProject3 {
	public static  void main(String[] args){
		int[] array = {5, 10, 15, 20, 25, 30};
		int length= array.length;
		int key ;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the elemenet to search ");
        key=sc.nextInt();
		int outcome = exponentialSearch(array,length,key);
		if(outcome<0)
			System.out.println( "Element is not present in the array");
		else 
			System.out.println( "Element is  present in the array at index :"+outcome);
		sc.close();
    }
	public static int exponentialSearch(int[] arr ,int length, int value ){
		if(arr[0]==value)
			return 0;
		int i=1;
		while(i<length && arr[i]<=value){
			i=i*2;
		}
		return Arrays.binarySearch(arr,i/2,Math.min(i,length),value);
		}
 }
