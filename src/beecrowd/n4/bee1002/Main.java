package beecrowd.n4.bee1002;

import java.util.Scanner;

public class Main {

	/**
	 * https://judge.beecrowd.com/pt/problems/view/1002
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double raio = sc.nextDouble();
		double pi = 3.14159;
		double area = pi * Math.pow(raio, 2);

		// Imprime no formato correto: "A=valor" com 4 casas decimais
		System.out.printf("A=%.4f%n", area);
		sc.close();

	}

}
