package ru.examples.example;

/**
 * Created by TheDr0t on 12/1/2017.
 */
public class Calculater {
    /**
     * Result of calculation
     */
    private int result;

    /**
     * Summing args
     * @param params is args of summ
     */
    public void add (int...params){
        for(Integer param: params){
            this.result+=param;
        }
    }

    /**
     *
     * @return result of summing
     */
    public int getResult(){
        return this.result;
    }

    /**
     * Clean result
     */
    public void cleanResuln(){
        this.result=0;
    }
}
