package beecrowd.n1.bee1015;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	/**
	 * https://judge.beecrowd.com/pt/problems/view/1015
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] l1 = sc.nextLine().split(" ");
		String[] l2 = sc.nextLine().split(" ");

		BigDecimal x1 = new BigDecimal(l1[0]);
		BigDecimal y1 = new BigDecimal(l1[1]);
		BigDecimal x2 = new BigDecimal(l2[0]);
		BigDecimal y2 = new BigDecimal(l2[1]);

		BigDecimal distancia = distanciaEntrePontos(x1, x2, y1, y2);

		System.out.println(distancia);

		sc.close();

	}

	private static BigDecimal distanciaEntrePontos(BigDecimal x1, BigDecimal x2, BigDecimal y1, BigDecimal y2) {
		BigDecimal powX = x2.subtract(x1).pow(2);
		BigDecimal powY = y2.subtract(y1).pow(2);
		BigDecimal pow = powX.add(powY);
		return new BigDecimal(Math.sqrt(pow.doubleValue())).setScale(4, RoundingMode.HALF_UP);
	}

}
