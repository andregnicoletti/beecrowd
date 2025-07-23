package beecrowd.n4.bee1022;

import java.util.Scanner;


public class Main {

	/**
	 * https://judge.beecrowd.com/pt/problems/view/1022
	 */

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int n1 = sc.nextInt();
            String bar1 = sc.next();
            int d1 = sc.nextInt();
            String op = sc.next();
            int n2 = sc.nextInt();
            String bar2 = sc.next();
            int d2 = sc.nextInt();

            int num = 0, den = 0;

            // Realiza a operação
            if (op.equals("+")) {
                num = n1 * d2 + n2 * d1;
                den = d1 * d2;
            } else if (op.equals("-")) {
                num = n1 * d2 - n2 * d1;
                den = d1 * d2;
            } else if (op.equals("*")) {
                num = n1 * n2;
                den = d1 * d2;
            } else if (op.equals("/")) {
                num = n1 * d2;
                den = n2 * d1;
            }

            // Guarda valores não simplificados
            int numOriginal = num;
            int denOriginal = den;

            // Simplifica resultado
            int mdc = mdc(Math.abs(num), Math.abs(den));
            num /= mdc;
            den /= mdc;

            // Garante que o denominador nunca seja negativo
            if (den < 0) {
                num *= -1;
                den *= -1;
            }

            System.out.println(numOriginal + "/" + denOriginal + " = " + num + "/" + den);
        }
    }

    // Função para calcular o Máximo Divisor Comum (MDC)
    public static int mdc(int a, int b) {
        if (b == 0)
            return a;
        return mdc(b, a % b);
    }

}
