package intermediarylist02;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(4,2,7,9,8,5,4,3,1,6,11));
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers); //Woww!

//       TreeSet a = new TreeSet<>(numbers); //Forma de ordenar também, mas tira duplicatas
//       System.out.println(a);

//        numbers.sort();
//        numbers.sort((a,b)-> Integer.compare(a,b))

    }
}
