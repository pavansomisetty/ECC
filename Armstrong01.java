
public class Armstrong01 {
	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 1999;
		System.out.println(generateArmstrongNums(num1, num2));
	}

	public static String generateArmstrongNums(int start, int limit) {
		String str = "";
		if (start <= 0 || limit <= 0)
			return "-1";
		if (start >= limit)
			return "-2";

		for (int i = start; i <= limit; i++) {

			if (isArmstrong(i))

				str += i + ",";
		}
		if (str == " ")
			return "-3";
		else

			return str.substring(0, str.length() - 1);
	}

	public static boolean isArmstrong(int num) {

		if (num == sumOfPowersOfDigits(num))
			return true;

		else
			return false;

	}

	public static int sumOfPowersOfDigits(int n) {

		int temp[] = getDigits(n);
		int sum = 0;

		for (int i = 0; i < temp.length; i++) {

			sum += power(temp[i], temp.length);

		}
		return sum;
	}

	public static int[] getDigits(int n) {

		int size = getDigitCount(n);

		int a[] = new int[size];

		int rem;

		for (int i = 0; i < a.length; i++) {

			rem = n % 10;

			a[i] = rem;

			n = n / 10;
		}

		return a;

	}

	public static int getDigitCount(int n) {

		int count = 0;

		while (n > 0) {
			// rem = n % 10;
			count++;
			n = n / 10;
		}

		return count;
	}

	public static int power(int d, int p) {
		int result = 1;

		for (int i = 1; i <= p; i++) {

			result *= d;
		}

		return result;

	}

}
