
public class RoundSum01 {
	public static void main(String[] args) {
        int a = 23, b = 34, c = 69;
        System.out.println(sumOfMultiples(a, b, c));
    }

    public static int sumOfMultiples(int a, int b, int c) {
        
    	int num1, num2, num3, sum;

		if (a < 1 || b < 1 || c < 1)
			return -1;
		else {
			num1 = getroundof10(a);
			num2 = getroundof10(b);
			num3 = getroundof10(c);

			sum = num1 + num2 + num3;

			return sum;
		}    	
    }
    public static int getroundof10(int num) {

		int digit = 1;

		if (num % 10 == 0)
			return num;

		 else

				digit = ((num / 10) + 1) * 10;

			return digit;
		}
    
    
    
}

