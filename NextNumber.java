
public class NextNumber {
	public static void main(String[] args) {
		System.out.println(NextNumber.nextNum(12465));
		System.out.println(NextNumber.nextNum(111222));

		System.out.println(NextNumber.nextNum(12465));
		System.out.println(NextNumber.nextNum(12466));
		System.out.println(NextNumber.nextNum(13575));
		System.out.println(NextNumber.nextNum(123456));

	}

	public static int nextNum(int num) {
		int count = 0, flag = 0, orgnum = num;
		while (num != 0) {
			int rem = num % 10;
			if (rem % 2 == 0) {
				count++;
			} else
				flag++;
			num = num / 10;

		}
		if (count > flag) {
			int r = orgnum % 10;
			orgnum = orgnum / 10;
			if (r % 2 == 0) {
				return (orgnum * 10 + r + 2);
			} else {
				return (orgnum * 10 + r + 1);
			}

		} else if (count < flag) {
			int r = orgnum % 10;
			orgnum = orgnum / 10;
			if (r % 2 == 0) {
				return (orgnum * 10 + r + 1);
			} else {
				return (orgnum * 10 + r + 2);
			}
		} else
			return orgnum;
	}
}
