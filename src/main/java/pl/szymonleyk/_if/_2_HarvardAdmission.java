package pl.szymonleyk._if;

import java.util.Scanner;

/**
 * After graduating from high school you have to pass an exam, and based on the result (points) choose the college.
 * Assume, you must have more than 258 point to be admitted to Harvard College.
 */
public class _2_HarvardAdmission {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("What is you result (points): ");
        var points = scanner.nextInt();

        if(points > 258){
            System.out.println("Hey! You got into Harvard College!");
        } else {
            System.out.println("Sorry, try again next year :(");
        }
    }
}
