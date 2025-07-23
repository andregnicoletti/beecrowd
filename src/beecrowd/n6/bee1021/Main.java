package beecrowd.n6.bee1021;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	/**
	 * https://judge.beecrowd.com/pt/problems/view/1021
	 */

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        BigDecimal value = sc.nextBigDecimal().setScale(2, RoundingMode.DOWN);
	        sc.close();

	        int[] notas = {100, 50, 20, 10, 5, 2};
	        BigDecimal[] moedas = {
	            new BigDecimal("1.00"),
	            new BigDecimal("0.50"),
	            new BigDecimal("0.25"),
	            new BigDecimal("0.10"),
	            new BigDecimal("0.05"),
	            new BigDecimal("0.01")
	        };

	        System.out.println("NOTAS:");
	        for (int nota : notas) {
	            BigDecimal notaBD = new BigDecimal(nota);
	            int quantidade = value.divideToIntegralValue(notaBD).intValue();
	            System.out.printf("%d nota(s) de R$ %.2f%n", quantidade, notaBD);
	            value = value.remainder(notaBD);
	        }

	        System.out.println("MOEDAS:");
	        for (BigDecimal moeda : moedas) {
	            int quantidade = value.divideToIntegralValue(moeda).intValue();
	            System.out.printf("%d moeda(s) de R$ %.2f%n", quantidade, moeda);
	            value = value.remainder(moeda);
	        }
	    }

}
