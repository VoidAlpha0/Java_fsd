package test;
import java.util.*;

public class Practice_Project5 {

	public static void main(String[] args) {
//		List
		List<String> list = new ArrayList<>();
		list.add("apple");
		list.add("Banana");
		list.add("Orange");
		System.out.println("List :");
		for(String i :list) {
			System.out.println(i);
		}
//		ArrayList
		ArrayList<String> alist= new ArrayList<>();
		alist.add("dog");
		alist.add("cat");
		alist.add("lion");
		System.out.println("Array List :");
		System.out.println(alist);
//		Set
		HashSet<Integer> s= new HashSet<>();
		s.add(10);
		s.add(20);
		s.add(30);
		System.out.println("Hash Set :");
		System.out.println(s);
//		LinkedHashSet
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
		lhs.add(101);
		lhs.add(102);
		lhs.add(103);
		System.out.println("LinkedHashSet :");
		System.out.println(lhs);
//		Vector
		Vector<Integer> v= new Vector<>();
		v.addElement(201);
		v.addElement(202);
		v.addElement(203);
		System.out.println("Vector :");
		System.out.println(v);
//		LinkedList
		LinkedList<String> ll= new LinkedList<>();
		ll.add("xyz");
		ll.add("pqr");
		ll.add("abc");
		System.out.println("LinkedList :");
		System.out.println(ll);
//		Map
		Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        System.out.println("Map :");
        for (Map.Entry<String, Integer> i : map.entrySet()) {
            System.out.println(i.getKey() + ": " + i.getValue());
        }
	}

}
