import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		System.out.println("Enter a number to check its a prime number or not");
		int n = p.nextInt();
		int a, flag = 0;
		a = n / 2;
		if (n == 0 || n == 1) {
			System.out.println("the number is not a prime number");
		} else {
			for (int i = 2; i <= a; i++) {
				if (n % i == 0) {
					System.out.println("It is not a prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println("It is a prime number");
			}
		}
	}
}
