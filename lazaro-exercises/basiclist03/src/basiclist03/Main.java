package basiclist03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(13);
        numbers.add(22);
        numbers.add(47);
        numbers.add(-2);
        numbers.add(30);
        numbers.add(6);
        numbers.add(-2);
        numbers.add(30);
        numbers.add(6);
//        numbers.add(-2);
//        numbers.add(30);
//        numbers.add(6);

        if (numbers.size() < 5){
            System.out.println("Lista pequena");
        } else if (numbers.size() <= 10 && numbers.size() >= 5){
            System.out.println("Lista média");
        } else System.out.println("Lista grande");
    }
}
