package beecrowd.n2.bee1005;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	/**
	 * https://judge.beecrowd.com/pt/problems/view/1005
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();

		double media = ((n1 * 3.5) + (n2 * 7.5)) / 11;

		System.out.println("MEDIA = " + new BigDecimal(media).setScale(5, RoundingMode.HALF_UP));

		sc.close();

	}
}
