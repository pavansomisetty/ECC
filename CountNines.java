
public class CountNines {
	public static int countAllNines(int x, int y) {
		int i, j, flagNine = 0, count = 0, l = 0;
		if (x > y) {
			i = y;
			j = x;

		} else {
			i = x;
			j = y;
		}

		if (i < 0 && j < 0) {
			return -1;

		} else if (i == 0 && j == 0)
			return -2;
		 else if (i > 0 && j > 0) {

			for (int k = i; k <= j; k++) {
				
				int rem = k % 10;
				int div = k / 10;
				if (rem == 9)
					flagNine++;
				if (div == 9)
					count++;
				l = count + flagNine;

			}
			
             
		}
		
		if (l==0)
		return -3;
		else {
		//System.out.println("Number of Nines in b/w given numbers are :" );
		return l;
		
		
		}
		
		// ADD YOUR CODE HERE
	}

	public static void main(String[] args) {
		System.out.println(countAllNines(79, 99));
		System.out.println(countAllNines(900, 898));
		System.out.println(countAllNines(9002223, 89232));
		System.out.println(countAllNines(-2, -4));
		System.out.println(countAllNines(10, 15));

	}

}
