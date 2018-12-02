
public class ECC_12_SumOfMul10 {
	public static void main(String[] args) {
		int a = 23, b = 34, c = 50;
		System.out.println(sumOfMultiples(a, b, c));
	}

	public static int sumOfMultiples(int a, int b, int c) {

		int num1, num2, num3, sum;

		if (a < 1 || b < 1 || c < 1)
			return -1;
		else {
			num1 = getmul10(a);
			num2 = getmul10(b);
			num3 = getmul10(c);

			sum = num1 + num2 + num3;

			return sum;
		}

	}

	public static int getmul10(int num) {

		int digit = 1;

		if (num % 10 == 0)
			return num;
		else

			digit = ((num / 10) + 1) * 10;

		return digit;
	}

}
