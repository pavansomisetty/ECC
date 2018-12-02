
public class SpinningString {
	public static void main(String[] arg) {
		System.out.println(SpinningString.rotate("talent", 1));
		System.out.println(SpinningString.rotate("talent", 2));
		System.out.println(SpinningString.rotate("talent", 3));
		System.out.println(SpinningString.rotate("abc", 1));
		System.out.println(SpinningString.rotate("abc", 2));
		System.out.println(SpinningString.rotate("abc", 3));
	}

	public static String rotate(String str, int no_of_positions) {

		String newStr = str;

		if (str == "" || str == null)
			return null;
		else if (no_of_positions == 0 || no_of_positions < 0)
			return str;
		else if (no_of_positions > str.length())
			return str;

		else {

			for (int j = 1; j <= no_of_positions; j++) {
				
				newStr = newStr.charAt(newStr.length() - 1) + newStr.substring(0, newStr.length() - 1);
				}
			}
		
		return newStr;

	}
}
