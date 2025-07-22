package beecrowd.n1.bee1017;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	/**
	 * https://judge.beecrowd.com/pt/problems/view/1017
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tempo = sc.nextInt();
		int velocidade = sc.nextInt();
		sc.close();

		double resultado = (tempo * velocidade) / 12.0;

		System.out.println(new BigDecimal(resultado).setScale(3, RoundingMode.HALF_UP));

	}

}
