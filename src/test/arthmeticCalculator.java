package test;

import java.util.Scanner;

class cal{
	int n1,n2,ans;
	
	void getValues() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Ist Value");
		n1=sc.nextInt();
		System.out.println("Enter IInd Value");
		n2=sc.nextInt();
	}
	
	int addition() {
		return n1+n2;
	}
	int subtraction() {
		return n1-n2;
	}
	int multiplication() {
		return n1*n2;
	}
	int division() {
		if(n2==0)
			return 0;
		else
		return n1/n2;
	}
	int modulus() {
		return n1%n2;
	}
}
public class arthmeticCalculator {

	public static void main(String[] args) {
		cal a= new cal();
		a.getValues();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your choice 1. Add 2. Sub 3. Mult 4. Div 5. Remainder ");
		int choice=sc.nextInt();
		switch(choice) {
		case 1 : System.out.println("sum="+a.addition()); break;
		case 2 : System.out.println("Difference="+a.subtraction()); break;
		case 3 : System.out.println("product="+a.multiplication()); break;
		case 4 : System.out.println("Questiont="+a.division()); break;
		case 5 : System.out.println("Remainder="+a.modulus()); break;
		default : System.out.println("Select a choice between 1 to 5");
		}
		
	}

}


