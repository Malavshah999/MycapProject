import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {
		int a, sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to checks if its a palindrome or not");
		a = input.nextInt();
		int number = a;
		while (a > 0) {
			int num = a % 10;
			sum = (sum * 10) + num;
			a = a / 10;
		}
		System.out.println("Palindrome is " + sum);
		if (number == sum) {
			System.out.println("It is a palindrome");
		} else {
			System.out.println("Its not a palindrome");
		}

	}

}
