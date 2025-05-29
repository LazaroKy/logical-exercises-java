package intermediarylist06;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>(Arrays.asList(1,2,4,2,1,3,8,9,6,4,12,23,12,66,66));

        System.out.println(numeros);
        HashSet numerosNaoDuplicados = new HashSet(numeros); //sem duplicatas, mas sem se importar com a ordem
        System.out.println(numerosNaoDuplicados);

    }
}
