import java.util.Scanner;

public class CheckArmstrong {

	public static void main(String[] args) {
		int rem, reverse = 0, number;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to know if its armstrong number or not ");
		int n = sc.nextInt();
		number = n;
		while (n > 0) {
			rem = n % 10;
			reverse = reverse + rem * rem * rem;
			n = n / 10;
		}
		if (number == reverse) {
			System.out.println("The number is an armstrong number");
		} else
			System.out.println("The number is not an armstrong");
	}

}
