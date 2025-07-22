package beecrowd.n1.bee1016;

import java.util.Scanner;

public class Main {

	/**
	 * https://judge.beecrowd.com/pt/problems/view/1016
	 */

	public static void main(String[] args) {

		int distancia = getInput();

		int tempo = distancia * 2;
		System.out.println(tempo + " minutos");

	}

	private static int getInput() {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		return input;
	}

}
