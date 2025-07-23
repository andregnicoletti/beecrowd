package beecrowd.n2.bee1009;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	/**
	 * https://judge.beecrowd.com/pt/problems/view/1009
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
//		String employeeName = sc.next(); // não usado
		sc.next();
		double employeeSalary = sc.nextDouble();
		double employeeSales = sc.nextDouble();
		double bonus = 0.0;

		if (employeeSales > 0) {
			bonus = employeeSales * 0.15;
		}

		BigDecimal salaryTotal = new BigDecimal(employeeSalary + bonus).setScale(2, RoundingMode.HALF_UP);

		System.out.println("TOTAL = R$ " + salaryTotal);

		sc.close();

	}

}
