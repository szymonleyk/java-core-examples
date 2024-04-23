package pl.szymonleyk._if;

import java.util.Scanner;

/**
 * Based on the temperature, I will suggest what you can wear.
 */
public class _10_DressAssistant {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("What is the temperature? ");
        var temperature = scanner.nextInt();

        System.out.print("I suggest ");
        if(temperature > 30){
            System.out.println("shorts or dress.");
        } else if(temperature > 10) {
            System.out.println("trousers.");
        } else {
            System.out.println("thick jacket!");
        }
    }
}
