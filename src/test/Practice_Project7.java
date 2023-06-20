package test;

public class Practice_Project7 {

	public static void main(String[] args) {
		int[] num =new int[6];
		num[0] = 10;
		num[1] = 11;
		num[2] = 12;
		num[3] = 13;
		num[4] = 14;
		num[5] = 15;
		
		int sum=0;
		System.out.println("Array Elements :");
		for(int i=0 ;i<num.length; i++) {
			System.out.println(num[i]);
			sum += num[i];
		}
		
		System.out.println("Sum of array :" + sum);
		
		String[] names = new String[6];
		names[0] = "xyz";
		names[1] = "abc";
		names[2] = "pqr";
		names[3] = "uvw";
		names[4] = "jqk";
		names[5] = "mno";
		
		System.out.println("Names in the array :");
		for(String x : names) {
			System.out.println(x);
		}
	}

}
