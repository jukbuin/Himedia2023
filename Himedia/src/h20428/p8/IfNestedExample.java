package h20428.p8;

import java.util.Scanner;

public class IfNestedExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int score = 84;
		int score = scan.nextInt();
		scan.close();

		if (score >= 90) {
			System.out.print("A");
			if (score >= 95) {
				System.out.print("+");
			} else {
				System.out.print("-");
			}
		} else {
			System.out.print("B");
			if (score >= 85) {
				System.out.print("+");
			} else {
				System.out.print("-");
			}
		}
	}
}
