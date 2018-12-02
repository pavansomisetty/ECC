
public class ECC_13_RoundedSum {
	public static void main(String[] args) {
		int a = 23, b = 34, c = 66;
		System.out.println(sumOfRoundedValues(a, b, c));
	}

	public static int sumOfRoundedValues(int n1, int n2, int n3) {

		int num1, num2, num3, sum;

		if (n1 < 1 || n2 < 1 || n3 < 1)
			return -1;
		else {
			num1 = getroundof10(n1);
			num2 = getroundof10(n2);
			num3 = getroundof10(n3);

			sum = num1 + num2 + num3;

			return sum;
		}

	}

	public static int getroundof10(int num) {

		int digit = 1, rem;

		if (num % 10 == 0)
			return num;

		else {

			rem = num % 10;
			if (rem < 5) {
				digit = ((num / 10)) * 10;

			} else

				digit = ((num / 10) + 1) * 10;

			return digit;
		}
	}

}
