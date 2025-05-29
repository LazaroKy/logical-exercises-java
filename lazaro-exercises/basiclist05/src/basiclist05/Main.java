package basiclist05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>((Arrays.asList(1,2,3,4,5,6,7,8,9,10)));

        System.out.println(numbers);
        for (int i= 0; i < numbers.size() ; i++){
            if (numbers.get(i) % 2 == 0){
                numbers.remove(numbers.get(i));
            }
        }
        System.out.println(numbers);

    }
}
