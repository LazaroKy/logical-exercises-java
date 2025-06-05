package chatchallenge02;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

       String[] texts = {"abc", "bca", "xyz", "zyx", "foo"};

        System.out.println(anagramPairs(texts));

    }

    public static int anagramPairs(String[] array){
        int totalPairs = 0;

        Map<String, Integer> pairsLetters = new HashMap<>();
        for (String st : array){
            char[]  letters =st.toCharArray();
            Arrays.sort(letters);
            String stSorted =new String(letters);

            pairsLetters.computeIfPresent(stSorted,(key, value)-> value+1);
            pairsLetters.putIfAbsent(stSorted, 1);

        }

        for (int value : pairsLetters.values()){
            if (value>= 2){
                totalPairs+= value * (value - 1) / 2;
            }
        }

        return totalPairs;
    }
}