package scanner;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static final String wightspace = " ";

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] array = new int[10];

		System.out.println("Fill your new array, array lenght: " + array.length);
		for (int i = 0; i < array.length; i++) {
			System.out.println("Fill cell number: " + (i + 1));
			array[i] = sc.nextInt();
		}

		sc.close();

		System.out.print("Your Array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + wightspace);
		}

		printNewEmptyLine();

		System.out.print("Кратні числа: ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.print(array[i] + wightspace);
			}
		}

		printNewEmptyLine();

		System.out.print("Некратні числа: ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				System.out.print(array[i] + wightspace);
			}
		}

		printNewEmptyLine();

		System.out.print("Your sorted Array: ");
		printSortArray(array);

	}

	private static void printSortArray(int[] array) {
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + wightspace);
		}
	}

	private static void printNewEmptyLine() {
		System.out.println();
	}
}
