package beecrowd.n1.bee1007;

import java.util.Scanner;

public class Main {

	/**
	 * https://judge.beecrowd.com/pt/problems/view/1007
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();

		int diferenca = ((n1 * n2) - (n3 * n4));
		System.out.println("DIFERENCA = " + diferenca);

		sc.close();

	}

}
