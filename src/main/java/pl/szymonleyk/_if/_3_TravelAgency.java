package pl.szymonleyk._if;

import java.util.Scanner;

/**
 * You and your family have a budged dedicated for summer vacation. Let's check where you can go.
 */
public class _3_TravelAgency {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("What is you budget?: ");
        var budget = scanner.nextInt();

        System.out.println("You can go to: ");
        if (budget > 5_000) {
            System.out.println("* London");
        }
        if (budget > 10_000) {
            System.out.println("* Madrid");
        }
        if (budget > 20_000) {
            System.out.println("* Maldives");
        }
    }
}
