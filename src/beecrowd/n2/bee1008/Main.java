package beecrowd.n2.bee1008;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	/**
	 * https://judge.beecrowd.com/pt/problems/view/1008
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int idWorker = sc.nextInt();
		int hours = sc.nextInt();
		double valuePerHour = sc.nextDouble();

		BigDecimal salary = new BigDecimal(hours * valuePerHour).setScale(2, RoundingMode.HALF_UP);

		System.out.println("NUMBER = " + idWorker);
		System.out.println("SALARY = U$ " + salary);

		sc.close();

	}

}
