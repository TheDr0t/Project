//package chap5;

/**
 * Created by TheDr0t on 10/10/2017.
 */
public class StrDinam {
    static void dinam(String... strings){
        for (String s: strings){
            System.out.println(s);
        }
    }
    public static void main(String... args) {
        dinam("one", "two", "three", "four", "five");
        dinam(new String[]{"six", "seven", "eight"});
        System.out.println("Excellent");
        for(String s:args) System.out.println(s);
    }
}
