package pl.szymonleyk._if;

import java.util.List;
import java.util.Scanner;

public class _4_CinemaTicketVerification {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var validTickets = List.of("aaa1", "bbb2", "ccc3");

        System.out.print("Enter ticket number: ");
        var ticket = scanner.nextLine();

        if (validTickets.contains(ticket)) {
            System.out.println("Ok, come in!");
        } else {
            System.out.println("Sorry, your ticket is not valid.");
        }
    }
}
