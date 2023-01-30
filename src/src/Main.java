package src;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner holdInput = new Scanner(System.in);

		while (true) {
			System.out.println("Please enter the number:");
			int input = holdInput.nextInt();
			int arr[] = { 1, 2, 3, 1 };
			int counter = 0;

			for (int i = 0; i <= 3; i++) {
				if (arr[i] == input) {
					counter = counter + 1;
				}
			}
			if (counter == 0) {
				System.out.println("Not Found!");
				System.out.println("__________");
			} else {
				System.out.println(input + " is appear " + counter + " times");
				System.out.println("__________");
			}
		}
	}

}
