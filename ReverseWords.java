
public class ReverseWords {
	public static void main(String[] args) {
		System.out.println(ReverseWords.reverse("talent sprint"));
		System.out.println(ReverseWords.reverse("abc efg"));
	}

	public static String reverse(String str) {
		String reverse1 = "";
		String[] temp = new String[20];

		if (str == "" || str == null) {

			return null;
		} else {

			String parts[] = str.split(" ");

			for (int k = 0; k <= (parts.length) - 1; k++) {

				temp[k] = parts[k];

				for (int i = temp[k].length() - 1; i >= 0; i--) {

					reverse1 += temp[k].charAt(i);
				}
				reverse1 += " ";
			}

			return reverse1.trim();
		}	

}
}