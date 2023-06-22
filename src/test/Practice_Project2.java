package test;


	
public class Practice_Project2{
	public int publicvar;
	protected int protectedvar;
	private int privatevar;
	int defaultvar;
	
	public void publicMethod() {
        System.out.println("This is a public method.");
    }
    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

    void defaultMethod() {
        System.out.println("This is a default method.");
    }

	
	public static void main(String[] args) {
		Practice_Project2 a= new Practice_Project2();
		a.publicvar = 1;
		a.protectedvar = 2 ;  // cannot be used in inherited class like a normal variable it becomes a private variable
		a.privatevar = 3;  // cannot be used outside of this class
		a.defaultvar = 4;
		
		a.publicMethod();
		a.protectedMethod();// cannot be used in inherited class like a normal method it becomes a private method
		a.privateMethod();// cannot be used outside of this class
		a.defaultMethod();
		
	}
}
