package prob3;

public class Prob3 {
	static char[] reverse = null;

	public static void main(String args[]) {

		char[] array1 = reverse("Hello World");
		printCharArray(array1);

		char[] array2 = reverse("Java Programming!");
		printCharArray(array2);

	}

	public static char[] reverse(String str) {
		/* 구현코드 */
		StringBuffer a = new StringBuffer(str);
		a.reverse();
		a.toString().toCharArray();
		reverse = new char[str.length()];
		int j = 1;
		for (int i = 0; i < str.length(); i++) {
			reverse[i] = str.charAt(str.length() - j++);
		}

		return reverse;

	}

	public static void printCharArray(char[] array) {
		/* 구현코드 */
		System.out.println(reverse);
	}
}
