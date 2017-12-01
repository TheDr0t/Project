package ru.examples.example;
import java.util.Scanner;
/**
 * Created by TheDr0t on 12/1/2017.
 */
public class InterractRunner {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            Calculater calc = new Calculater();
            String exit = "no";
            while (!exit.equals("yes")) {
                System.out.println("Enter the first number");
                int first=Integer.valueOf(reader.next());
                System.out.println("Enter the second number");
                int second=Integer.valueOf(reader.next());
                calc.add(first, second);
                System.out.println("result is " + calc.getResult());
                calc.cleanResuln();
                System.out.println("Exit calcultater? yes/no");
                exit=reader.next();
            }
        }
        finally {
            reader.close();
        }
    }
}
