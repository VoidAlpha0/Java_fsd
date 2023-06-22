package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice_Project10 {

	public static void main(String[] args) {
		String pattern = "[a-z]+";
		String check = "RemovE AlL capital alphabets & special charecters";
		Pattern p = Pattern.compile(pattern);
		Matcher c = p.matcher(check);
		
		while (c.find())
	      	System.out.println( check.substring( c.start(), c.end() ) );

	}

}
