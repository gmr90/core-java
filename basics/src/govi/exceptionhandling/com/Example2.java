package govi.exceptionhandling.com;

public class Example2 {
	
	public int intDivide(int i, int j) {
		try {
			return i/j;
		}
		catch(ArithmeticException ae) {
			System.out.println(ae);
			return 0;
		}
		catch(Exception e) {
			return 0;
		}
	}

	public static void main(String args[]) {
		
		Example2 e1 = new Example2();
		System.out.println(" "+e1.intDivide(1, 1));
		
	}
	
	// you can have multiple catch blocks 
	
}
