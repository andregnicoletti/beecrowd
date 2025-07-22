package beecrowd.n4.bee1018;

import java.util.Scanner;

public class Main {

	/**
	 * https://judge.beecrowd.com/pt/problems/view/1018
	 */

	public static void main(String[] args) {
		int input = getInput();

		System.out.println(input);
		input = verificaCedula(input, 100);
		input = verificaCedula(input, 50);
		input = verificaCedula(input, 20);
		input = verificaCedula(input, 10);
		input = verificaCedula(input, 5);
		input = verificaCedula(input, 2);
		input = verificaCedula(input, 1);

	}

	private static int verificaCedula(int input, int cedula) {
		int resto = (input / cedula);
		input -= (resto * cedula);
		System.out.println(resto + " nota(s) de R$ " + cedula + ",00");
		return input;
	}

	private static int getInput() {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		return input;
	}

}
