package intermediarylist01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] cores = {"Vermelho", "Azul", "Verde"};
        System.out.println(Arrays.toString(cores));
        //Througth args
//        List<String> listaString = new ArrayList<>(Arrays.asList(cores));

//        List<String> listaString2 = new ArrayList<>(Arrays.asList(cores));
//        for (String cor : cores){
//            listaString2.add(cor);
//        }

        List<String> listaString3 = new ArrayList<>();
        Collections.addAll(listaString3, cores);
        System.out.println(listaString3);

    }
}
