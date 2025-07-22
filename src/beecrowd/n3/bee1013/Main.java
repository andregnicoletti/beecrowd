package beecrowd.n3.bee1013;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	/**
	 * https://judge.beecrowd.com/pt/problems/view/1013
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] values = sc.nextLine().split(" ");

		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i < values.length; i++) {
			numbers.add(Integer.parseInt(values[i]));
		}

		System.out.println(Collections.max(numbers) + " eh o maior");

		sc.close();

	}

}
