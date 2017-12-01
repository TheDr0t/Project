package ru.examples.example;

/**
 * Created by TheDr0t on 12/1/2017.
 */
public class Calculate {
    public static void main(String[] args) {
        int a,b,summ,diff,div;
        double sqr=1.0;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        summ=a+b;
        diff=a-b;
        div=a/b;
        if (b>0) {
            for (int i = 0; i < b; i++) {
                sqr = sqr * a;
            }
        }
        if (b==0) sqr=1;
        if (b<0) {
            for (int i = 0; i > b; i--) {
                sqr = sqr / a;
            }
        }
        System.out.println("Calculate...");
        System.out.println("Sum " + summ);
        System.out.println("Diff " + diff);
        System.out.println("div " + div);
        System.out.println("Sqr " + sqr);
    }
}
