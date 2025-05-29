package intermediarylist03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> mensagens = new ArrayList<>();
        Collections.addAll(mensagens,"Olá","Oi","Tudo bem?");

        System.out.println("Lista original:");
        System.out.println(mensagens);

        System.out.println("---------------------");
//        List<String> copiaMensagens1 = //mensagens;
                                       //new ArrayList<>(mensagens);
//        copiaMensagens1.add("Tudo!");
//        System.out.println("Cópia da lista original (adiciona mais uma mensagem):");
//        System.out.println(copiaMensagens1);
//        System.out.println("Lista original:");
//        System.out.println(mensagens);
//        System.out.println("---------------------");
        List<String> copiaMensagens = mensagens.stream().toList();
        System.out.println("Cópia da lista - com stream().toList():");
        System.out.println(copiaMensagens);
        System.out.println("Lista original com mais uma mensagem:");
        mensagens.add("Tudo!");
        System.out.println(mensagens);


    }
}
