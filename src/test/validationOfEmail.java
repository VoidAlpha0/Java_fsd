package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class validationOfEmail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		String emailPattern = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
		System.out.println("Enter email Id");
		String str =sc.nextLine();
		Pattern p = Pattern.compile(emailPattern);
		Matcher m = p.matcher(str);
		if(m.matches()) {
			System.out.println("email accepted");
		}
		else {
			System.out.println("not a email.");
		}
//		System.out.println("enter 0 to exit");
//		String s = sc.nextLine();
//		if(s=="0") {
//			continue;
//		
//		}
		
	}

}
