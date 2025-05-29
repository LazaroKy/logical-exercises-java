package intermediarylist07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 3,2,4,6,7,8,9,11,21,34,62,45,76,39,92,25,55,76,87,100);
        System.out.println("List size: " + numbers.size());
        System.out.println(numbers);
        System.out.println("Indexes: ");
        for (int j = 0; j < numbers.size(); j++) {
            System.out.print("/"+j + "\\");
        }
        System.out.println();

//        System.out.println();
//        List<Integer> numbersSubList = new ArrayList<>();
//        for (int i =4; i< 14; i++){
//            numbersSubList.add(numbers.get(i));
//        }
//        System.out.println(numbersSubList);

        System.out.println(numbers.subList(4,14));
    }
}
