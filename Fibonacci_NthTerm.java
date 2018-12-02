
public class Fibonacci_NthTerm {

	public static void main(String[] args) {
				System.out.println(getNthTermOfFibonacciSeries(7));
	}

	public static int getNthTermOfFibonacciSeries(int nthTerm) {
		int a = 0 , b = 1 , c ;
		if (nthTerm <= 1)
			return -1;
		
		else
			for (int i = 2; i < nthTerm; i++) {
	            c = a + b;
	            a = b;
	            b = c;
		
			}
		
		

		return b;
	}

}
