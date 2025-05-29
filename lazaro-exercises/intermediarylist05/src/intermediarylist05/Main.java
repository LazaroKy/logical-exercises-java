package intermediarylist05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
            List<String> mensagens = new ArrayList<>();
            Collections.addAll(mensagens,"Olá","Oi","Tudo bem?");

            String[] arrayOfStrings = mensagens.toArray(String[]::new);
            System.out.println(Arrays.toString(arrayOfStrings));
    }
}
