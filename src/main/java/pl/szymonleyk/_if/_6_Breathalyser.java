package pl.szymonleyk._if;

import java.util.Scanner;

/**
 * This program ask you, how many beers you have drunk and tell you if can/can't drive car.
 * 0-5 ? YES
 * 5 - more ? NO
 */
public class _6_Breathalyser {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("How many beers have you drunk? ");
        var drunkBeer = scanner.nextInt();

        if (drunkBeer <= 5) {
            System.out.println("OK, you can drive.");
        } else {
            System.out.println("Sorry, you can't drive.");
        }
    }
}
