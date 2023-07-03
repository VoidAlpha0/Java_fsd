package test2;

interface A{
	default void show() {System.out.println("Interface A");}
}

interface B{
	default void show() {System.out.println("Interface B");}
}

class C implements A,B{
	public void show() {
		B.super.show();
		A.super.show();
		
	}
}

public class Practice_project9 {

	public static void main(String[] args) {
		C ob = new C();
		ob.show();
	}

}
