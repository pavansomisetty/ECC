
public class StarPyramid01 {

	public static void main(String[] args) {
		System.out.print(starPattern(5));
	}

	public static String starPattern(int rows) {

		String str = "";

		if (rows < 1)
			return "-1";
		else {
			for (int i = 1; i <= rows; i++) {

				for (int k = rows; k > i; k--) {

					str += " ";
				}
				for (int j = 1; j <= i; j++) {

					str += " *";
				}
				str += "\n";
			}

		}

		return str;
	}

}
