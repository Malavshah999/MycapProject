import java.util.Scanner;

public class GetPrime {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = input.nextInt();

		if (n == 0 || n == 1) {
			System.out.println("Prime numbers starts from 2");
		}
		int count;
		for (int i = 2; i <= n; i++) {
			count = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					count++;
					break;
				}

			}
			if (count == 0) {
				System.out.print(i + " ");

			}

		}
	}
}
