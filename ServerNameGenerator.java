import java.util.Arrays;
import java.math.*;
public class ServerNameGenerator {


       public static String[] nouns = {"dog", "cat", "woman", "man", "boy", "girl", "mom", "dad", "car", "bike"};

        public static String[] adjectives = {"hot", "cold", "fat", "skinny", "tall", "short", "thin", "thick", "small", "big"};

    public static String randomElement (String[] array) {
       return array[(int) Math.floor(Math.random()* array.length)];
    }


    public static void main(String[] args) {
        System.out.println("here is your sever name: \n" + randomElement(adjectives) + "-" + randomElement(nouns));


    }




}
