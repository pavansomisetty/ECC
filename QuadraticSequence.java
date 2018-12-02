
public class QuadraticSequence {
	public static void main(String[] args) {
		System.out.println(QuadraticSequence.getQuadricSequence(10));

	}

	public static String getQuadricSequence(int n) {

		int a = 1;
		String str = "";
		
		if(n == 0 || n < 0){
			return null;
		}
		
		for (int i = 1; i <= n; i++) {

			str += a + ",";
			
			a += i+1;
		}

		return str.substring(0, str.length()-1);
	}
}
