package beecrowd.n2.bee1011;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	/**
	 * https://judge.beecrowd.com/pt/problems/view/1011
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double raio = sc.nextDouble();
		System.out.println("VOLUME = " + volume(raio));

		sc.close();

	}

	private static BigDecimal volume(double raio) {
		double volume = (4 / 3.0) * 3.14159 * Math.pow(raio, 3);
		return new BigDecimal(volume).setScale(3, RoundingMode.HALF_UP);
	}

}
