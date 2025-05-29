package intermediarylist04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> mensagens = new ArrayList<>();
        Collections.addAll(mensagens,"Olá","Oi","Tudo bem?");

        //System.out.println(mensagens.reversed());
        Collections.reverse(mensagens);
        System.out.println(mensagens);

//        List<String> listaInversa = new ArrayList<>();
//        for (int i = mensagens.size()-1; i >= 0; i--) {
//            listaInversa.add(mensagens.get(i));
//        }
//        System.out.println(listaInversa);
    }
}
