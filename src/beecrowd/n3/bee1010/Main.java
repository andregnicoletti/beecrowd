package beecrowd.n3.bee1010;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	/**
	 * https://judge.beecrowd.com/pt/problems/view/1010
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BigDecimal totalValue = new BigDecimal(0.0).setScale(2, RoundingMode.HALF_UP);

		for (int i = 0; i < 2; i++) {
			String line = sc.nextLine();
			totalValue = processLine(totalValue, line);
		}

		System.out.println("VALOR A PAGAR: R$ " + totalValue);

		sc.close();
	}

	private static BigDecimal processLine(BigDecimal totalValue, String line) {
		String[] valuesArray = line.split(" ");
		BigDecimal multiply = new BigDecimal(valuesArray[1]).multiply(new BigDecimal(valuesArray[2]));
		return totalValue.add(multiply);
	}

}
