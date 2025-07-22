package beecrowd.n1.bee1014;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	/**
	 * https://judge.beecrowd.com/pt/problems/view/1014
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		BigDecimal distancia = sc.nextBigDecimal();
		BigDecimal consumo = sc.nextBigDecimal();

		System.out.println(distancia.divide(consumo, 3, RoundingMode.HALF_UP) + " km/l");

		sc.close();

	}
}
