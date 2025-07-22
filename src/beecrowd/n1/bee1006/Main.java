package beecrowd.n1.bee1006;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	/**
	 * https://judge.beecrowd.com/pt/problems/view/1006
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();

		double media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;
		System.out.println("MEDIA = " + new BigDecimal(media).setScale(1, RoundingMode.HALF_UP));

		sc.close();

	}

}
