package test;

public class Practice_Project7 {
	private String outerMessage;
	
	public Practice_Project7(String message) {
        outerMessage = message;
    }

    // Inner class
    public class InnerClass {
        private String innerMessage;

        public InnerClass(String message) {
            innerMessage = message;
        }

        public void displayMessages() {
            System.out.println("Outer Message: " + outerMessage);
            System.out.println("Inner Message: " + innerMessage);
        }
    }

    public static void main(String[] args) {
    	Practice_Project7 outer = new Practice_Project7("Hello from outer");
    	Practice_Project7.InnerClass inner = outer.new InnerClass("Hello from inner");
        inner.displayMessages();
    }

	

}
