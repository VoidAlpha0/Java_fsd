package test;

public class Practice_Project8 {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Hello ");
		s.append("World!!");
		System.out.println(s);
		s.insert(0, 'w');
		System.out.println(s);
		//replace method
		s.replace(0, 3, "hiii");
		System.out.println(s);

		//delete method
		s.delete(0, 2);
		System.out.println(s);
		
		StringBuilder sb=new StringBuilder("How are ");
		sb.append("You");
		System.out.println(sb);

		System.out.println(sb.delete(0, 3));

		System.out.println(sb.insert(0, "where"));

		System.out.println(sb.reverse());
		
		String str= new String("Hii");
		
		StringBuffer sstr = new StringBuffer(str);
		System.out.println(sstr); 
		
		StringBuilder sbstr = new StringBuilder(str);
		System.out.println(sbstr); 


	}

}
