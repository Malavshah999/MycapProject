import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number till which u want fibonacci numbers");
		int n = input.nextInt();
		int i = 0, j = 1;
		for (int k = 0; k <= n; k++) {
			int sum = i + j;
			System.out.println(sum);
			i = j;
			j = sum;
		}
	}

}
