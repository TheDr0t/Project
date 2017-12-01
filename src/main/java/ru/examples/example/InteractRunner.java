package ru.examples.example;
import java.util.Scanner;
/**
 * Created by TheDr0t on 12/1/2017.
 */
public class InteractRunner {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            Calculator calc = new Calculator();
            String exit = "no";
            double first=0.0;
            while (!exit.equals("yes")) {
                if (first==0) {
                    System.out.println("Enter the first arg");
                    first = Double.valueOf(reader.next());
                }
                System.out.println("What need to do: add/diff/div/sqr");
                String whatDo=reader.next();
                System.out.println("Enter the arg");
                double second=Double.valueOf(reader.next());
                calc.choosing(whatDo, first, second);
                System.out.println("result is " + calc.getResult());
                System.out.println("Exit: yes/no");
                exit=reader.next().toLowerCase();
                if(exit.toLowerCase().equals("no")){
                    System.out.println("Save result: yes/no");
                    if (reader.next().toLowerCase().equals("yes")) first=calc.getResult();
                    else first=0;
                }
                calc.cleanResult();
            }
        }
        finally {
            reader.close();
        }
    }
}
