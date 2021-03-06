package ru.examples.example;

/**
 * Created by TheDr0t on 12/1/2017.
 */
public class Calculator {
    /**
     * Result of calculation
     */
    private double result;
    /**
     * Summing 2 args
     * @param arg1 first arg
     * @param arg2 second arg
     */
    private void add (double arg1, double arg2){
        this.result=arg1+arg2;
    }
    /**
     * Difference of 2 args
     * @param arg1 first arg
     * @param arg2 second arg
     */
    private void diff (double arg1, double arg2){
        this.result=arg1-arg2;
    }
    /**
     * Division 2 args
     * @param arg1 first arg
     * @param arg2 second arg
     */
    private void div (double arg1, double arg2){
        this.result= arg1/arg2;
    }
    /**
     * Math.pow
     * @param arg1 first arg
     * @param arg2 second arg
     */
    private void sqr (double arg1, double arg2){
            this.result=Math.pow(arg1, arg2);
    }
    /**
     *
     * @return result of calculation
     */
    public double getResult(){
        return this.result;
    }

    /**
     * Clean result
     */
    public void cleanResult(){
        this.result=0.0;
    }

    /**
     * Switch between methods and return result
     * @param method add/diff/div/sqr
     * @param first first arg
     * @param second second arg
     * @return double result of calculation
     */
    public double choosing(String method, double first, double second) {
        switch (method) {
            case "add":
                this.add(first, second);
                break;
            case "diff":
                this.diff(first, second);
                break;
            case "div":
                this.div(first, second);
                break;
            case "sqr":
                this.sqr(first, second);
                break;
            default:
                System.out.println("Wrong operation, try another");
        }
        return this.getResult();
    }
}
