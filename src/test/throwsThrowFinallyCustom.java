package test;

class custExp extends Exception{
	public custExp(String s) {
		super(s);
	}
	
	public custExp(String s, Throwable e) {
		super(s, e);
	}
}

public class throwsThrowFinallyCustom {

	public static void main(String[] args) {
		try {
			divide(10,0);
		}catch (custExp e) {
			System.out.printkn("custom expetion called: "+ e.message());
		}finally {
			System.out.println("Executing Final bloc");
		}
	}
}
