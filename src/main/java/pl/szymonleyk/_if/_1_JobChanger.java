package pl.szymonleyk._if;

import java.util.Scanner;

/**
 * Let's imagine, you work in the Amazon company, and you have a meeting with your manager
 * about salary raise. If he increases your salary, you will stay,
 * otherwise you will change to Google company.
 */
public class _1_JobChanger {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var currentCompany = "Amazon";

        System.out.println("I work for "+currentCompany);

        System.out.print("Will I get salary raise? (Y/N) ");
        var answer = scanner.next();
        if(answer.equals("N")){
            currentCompany = "Google";
        }

        System.out.println("I work for "+currentCompany);
    }
}
