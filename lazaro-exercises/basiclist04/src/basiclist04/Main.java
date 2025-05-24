package basiclist04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> names = new ArrayList<>();

        names.add("Maycon");
        names.add("Neto");
        names.add("Micael");
        names.add("João");
        names.add("Vinicius");

        System.out.println("Digite o nome de uma pessoa para verificarmos se está na lista.");
        String inputName = scan.next(); //Just first name

        if (names.contains(inputName)){
            System.out.println("Parabéns! O nome informado está na lista.");
        } else {
            System.out.println("O nome informado não está na lista.");
        }
    }
}
