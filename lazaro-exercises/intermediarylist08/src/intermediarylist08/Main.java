package intermediarylist08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> mensagens1 = new ArrayList<>(Arrays.asList("Olá", "Tchau", "Até logo", "Volte sempre"));
        List<String> mensagens2 = new ArrayList<>(Arrays.asList("Olá", "Tchau", "Até logo", "Volte sempre"));
        List<String> mensagens3 = new ArrayList<>(Arrays.asList("Até logo", "Tchau","Volte sempre", "Olá"));

        System.out.println("Lista 1: "+mensagens1);
        System.out.println("Lista 2: "+mensagens2);
        System.out.println("Lista 3: "+mensagens3);
        if (mensagens1.equals(mensagens2)){
            System.out.println("As listas 1 e 2 são iguais");
        } else {
            System.out.println("As listas 1 e 2 são diferentes");
        }
        if (mensagens1.equals(mensagens3)){
            System.out.println("As listas 1 e 3 são iguais");
        } else {
            System.out.println("As listas 1 e 3 são diferentes");
        }
        if (mensagens2.equals(mensagens3)){
            System.out.println("As listas 2 e 3 são iguais");
        } else {
            System.out.println("As listas 2 e 3 são diferentes");
        }

        int sizeList = 4;
        for (int i = 0; i< sizeList; i++){
            System.out.println(mensagens2.get(i).equals(mensagens1.get(i)) ?
                    "Elemento de lista 1 e lista 2 no index: " + i + " são iguais!" :
                    "Elemento de lista 1 e lista 2  no index: " + i + " são diferentes!");
        }
        for (int i = 0; i< sizeList; i++){
            System.out.println(mensagens3.get(i).equals(mensagens1.get(i)) ?
                    "Elemento de lista 1 e lista 3 no index: " + i + " são iguais!" :
                    "Elemento de lista 1 e lista 3  no index: " + i + " são diferentes!");
        }

    }
}
