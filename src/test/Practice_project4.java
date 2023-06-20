package test;

class name_age{
	int age;
	String name;
	// Default constructor
	public name_age() {
		name= "XYZ";
		age = 23;
	}
	// Parameterized constructor
	public name_age(String name ,int age) {
		this.name = name;
		this.age = age;
	}
	// Copy constructor
	public name_age(name_age x) {
		this.name=x.name;
		this.age=x.age;
	}
	// displaying the value stored.
	void display() {
		System.out.println("name is "+name+ " age is "+ age);
	}
	
}

public class Practice_project4 {

	public static void main(String[] args) {
		name_age a = new name_age();
		name_age b = new name_age("abc", 25);
		name_age c = new name_age(b);
		a.display();
		b.display();
		c.display();
		
	}

}
