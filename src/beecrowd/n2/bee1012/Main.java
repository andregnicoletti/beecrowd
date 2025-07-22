package beecrowd.n2.bee1012;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	/**
	 * https://judge.beecrowd.com/pt/problems/view/1012
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		BigDecimal a = sc.nextBigDecimal();
		BigDecimal b = sc.nextBigDecimal();
		BigDecimal c = sc.nextBigDecimal();

		BigDecimal triangulo = triangulo(a, b, c);
		BigDecimal circulo = circulo(a, b, c);
		BigDecimal trapezio = trapezio(a, b, c);
		BigDecimal quadrado = quadrado(a, b, c);
		BigDecimal retangulo = retangulo(a, b, c);

		System.out.println("TRIANGULO: " + triangulo);
		System.out.println("CIRCULO: " + circulo);
		System.out.println("TRAPEZIO: " + trapezio);
		System.out.println("QUADRADO: " + quadrado);
		System.out.println("RETANGULO: " + retangulo);

		sc.close();

	}

	private static BigDecimal retangulo(BigDecimal a, BigDecimal b, BigDecimal c) {
		return (a.multiply(b)).setScale(3, RoundingMode.HALF_UP);
	}

	private static BigDecimal quadrado(BigDecimal a, BigDecimal b, BigDecimal c) {
		return b.multiply(b).setScale(3, RoundingMode.HALF_UP);
	}

	private static BigDecimal trapezio(BigDecimal a, BigDecimal b, BigDecimal c) {
		return (a.add(b)).multiply(c).divide(new BigDecimal(2)).setScale(3, RoundingMode.HALF_UP);
	}

	private static BigDecimal circulo(BigDecimal a, BigDecimal b, BigDecimal c) {
		return c.pow(2).multiply(new BigDecimal(3.14159)).setScale(3, RoundingMode.HALF_UP);
	}

	private static BigDecimal triangulo(BigDecimal a, BigDecimal b, BigDecimal c) {
		return (a.multiply(c)).divide(new BigDecimal(2)).setScale(3, RoundingMode.HALF_UP);
	}

}
