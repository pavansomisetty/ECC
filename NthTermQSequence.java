
public class NthTermQSequence {
	public static void main(String[] args) {
		System.out.println(NthTermQSequence.getNthTerm(10));

	}

	public static int getNthTerm(int n) {
		
		//String str = "";
		int a = 1 , b = 0;
		
		if(n == 0 || n < 0){
			return -1;
		}
		else{
			
			for (int i = 1; i <= n; i++) {

			//	str += a + ",";
				b = a;
				a += i+1;
			}
			
			return b;
			
		}
		
	}
}
