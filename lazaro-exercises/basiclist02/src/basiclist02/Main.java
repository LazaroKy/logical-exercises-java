package basiclist02;

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

        System.out.println("Print list of integers using 'for (type var : list){...}'");
        for (Integer number : numbers){
            System.out.println(number);
        }

        System.out.println("Print list of integers using traditional 'for (initialization; condition; increment) { ... }' with list.size()");
        for (int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }

        System.out.println("Print list of integers using '.forEach()' method");
        numbers.forEach(System.out::println);
    }
}
