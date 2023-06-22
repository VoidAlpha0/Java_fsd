package test;

public class Practice_project3 {

	public static void main(String[] args) {
		
		Practice_project3 exp = new Practice_project3();
		exp.insmessage("Instance method without return.");
		int s1=exp.inssum(3,5);
		System.out.println(s1 + " Instance method woth return.");
		message("Static method without return.");
		s1=sum(3,5);
		System.out.println(s1 + " Static method with return.");
		System.out.println("method overloading");
		int a1=exp.area(5,6);
		System.out.println(a1 + " area of the rectange calculated when two sides are given");
		a1=exp.area(9);
		System.out.println(a1 + " area of the circle calculated when only radius is given");
	}
	
	public static void message(String S) {
		System.out.println(S);
	}
	
	public void insmessage(String S) {
		System.out.println(S);
	}
	
	public static int sum(int a, int b) {
		return a+b;
	}
	
	public int inssum(int a, int b) {
		return a+b;	
	}
	
	public int area(int a , int b) {
		return a*b;
	}
	public int area(int r) {
		return (int)(3.14*r*r);
	}
	

}