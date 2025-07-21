package beecrowd.n1.bee2006;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    /**
     * https://judge.beecrowd.com/pt/problems/view/2006
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int teaType = sc.nextInt();
        sc.nextLine(); // Consume the newline character after the integer input

        int[] competitionResponse = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

//        Arrays.stream(competitionResponse).forEach(System.out::println);
        long count = Arrays.stream(competitionResponse).filter(r -> r == teaType).count();

        System.out.println(count);

        sc.close();

    }

}
