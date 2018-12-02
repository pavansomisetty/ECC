
public class ProductPanlindrome {
	public static void main(String[] args) {

		final int START = 10;
		final int END = 100;

		System.out.println(ProductPanlindrome.getCount(START, END));

	}

	public static int getCount(int start, int end) {
		int product = 1, count = 0;
		for (int i = start; i <= end; i++) {
			for (int j = start; j <= end; j++) {

				product = i * j;

				int ispalindrometrue = isPalindrome(product);
				/*
				 * while (product != 0) { int rem = product % 10; revnum =
				 * revnum * 10 + rem; product = product / 10;
				 * 
				 * }
				 */

				if (ispalindrometrue == 1) {

					count++;
				}

			}

		}

		return count;
	}

	public static int isPalindrome(int num) {
		int revnum = 0, orgnum = num;
		while (num != 0) {
			int rem = num % 10;
			revnum = revnum * 10 + rem;
			num = num / 10;

		}
		if (orgnum == revnum)
			return 1;
		else
			return 0;

	}

}
