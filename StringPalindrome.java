import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		String a, b = "";
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string to check wheather its palindrome or not");
		a = input.nextLine();
		int n = a.length();
		for (int i = n - 1; i >= 0; i--) {
			b = b + a.charAt(i);

		}
		if (a.equalsIgnoreCase(b)) /*
									 * Equals Ignore Case means it compares string a and b weather its same or not
									 * if its same and only case differs then it ignores the case and lets u know
									 * weather its same or not
									 */
		{
			System.out.println("Its an palindrome");
		} else
			System.out.println("Its not a palindrome");

	}

}
