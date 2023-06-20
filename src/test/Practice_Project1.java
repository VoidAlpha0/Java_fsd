package test;

public class Practice_Project1 {

	public static void main(String[] args) {
		int a1=99;
		double a2=99.32;
		double a1_d= a1;
		int a2_i = (int)a2;
//		Here when we do Implicit type cast that is type casting from int to double  we will not be losing data 
//		but in case of Explicit type cast that is type cast from double to int we will be losing the precision 
//		so there maybe loss of data during Explicit type casting.
		System.out.println("int value :"+ a1);
		System.out.println("double value :"+ a1_d);
		System.out.println("int value :"+ a2_i);
		System.out.println("double value :"+ a2);

	}

}
