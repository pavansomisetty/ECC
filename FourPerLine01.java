
public class FourPerLine01 {
	public static void main(String[] args) {
		int num = 14;
		System.out.println(getFourPerLine(num));
	}

	public static String getFourPerLine(int num) {
		String str = "";
		int c = 0;
		if (num < 1 || num > 99)
			return "-1";

		for (int i = 1; i <= num; i++) {
			str += i + " ";
			c++;
			while (c == 4 ) {
				str += "\n";
				c = 0;
			}
		}

		return str;
	}
}
