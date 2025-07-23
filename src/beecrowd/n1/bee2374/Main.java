package beecrowd.n1.bee2374;

import java.util.Scanner;

public class Main {

	/**
	 * https://judge.beecrowd.com/pt/problems/view/2374
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int pressaoDesejada = sc.nextInt();
		int pressaoPneu = sc.nextInt();

		sc.close();

		System.out.println(pressaoDesejada - pressaoPneu);

	}
}
