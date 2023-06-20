package test;

import java.util.*;

public class Practice_Project6 {

	public static void main(String[] args) {
//		Creating a HashMap
		HashMap<Integer,String> h = new HashMap<>();
		h.put(1,"apple");
		h.put(2,"banana");
		h.put(3,"orange");
		
//		Accessing each value using key
		String s1=h.get(1);
		String s2=h.get(2);
		System.out.println("1st element in map is " + s1 );
		System.out.println("2nd element in map is " + s2 );
		
//		Updating value using key
		h.put(1,"lemon");
		s1=h.get(1);
		System.out.println("New 1st element in map is " + s1 );
		
//		removing value using key
		h.remove(1);
		System.out.println("printing all elements of the hash map "+ h);
		
//		Creating a Tree map
		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(101, "xyz");
		tm.put(102, "abc");
		tm.put(103, "pqr");
		
//		Accessing each value using key
		String tm1=tm.get(101);
		String tm2= tm.get(102);
		System.out.println("value for 101 is "+ tm1);
		System.out.println("value for 102 is "+ tm2);
		
//		Updating value using key
		tm.put(101, "mno");
		tm1=tm.get(101);
		System.out.println("New 101 value in map is " + tm1 );
		
//		removing value using key
		tm.remove(101);
		System.out.println("printing all elements of the Tree map "+ tm);
	}

}
