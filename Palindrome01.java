
public class Palindrome01 {
	public static void main(String[] args) {
		int num = 787;

		System.out.println(isPalindrome(num));
	}

	public static int isPalindrome(int num) {
		int revnum = 0, orgnum = num;

		if (num >= 100 && num <= 999) {

			while (num != 0) {
				int rem = num % 10;
				revnum = revnum * 10 + rem;
				num = num / 10;

			}
			if (orgnum == revnum)
				return 1;
		}
		if (num < 100 || num > 999)
			return -1;
		else
			return 0;

		// ADD YOUR CODE HERE
	}

}
