package datastructureexercise03;

import java.util.*;
//Dois jogadores participam de um jogo de cartas, cada um com um deck contendo o mesmo número de cartas.
// A cada rodada, ambos revelam a primeira carta do topo de seus decks. Se a carta do jogador 1 for maior ou igual à do jogador 2,
//  ele vence a rodada, ficando com ambas as cartas: a sua retorna ao final do seu deck e ele adiciona a carta do oponente também ao final.
//   Caso contrário, o jogador 2 vence e faz o mesmo com as cartas. O jogo continua até que um dos jogadores fique sem cartas.
//     O objetivo é determinar quantas rodadas são necessárias até que isso aconteça.
public class Main {

    static int solution(int[] playerDeckA, int[]playerDeckB){
      return 0;
    }

    public static void main(String[] args) {
        int[] playerDeckA = {2, 3, 1, 2};
        int[] playerDeckB = {1, 3, 2, 9};

        int[] playerDeckA2 = {2, 4, 5, 2};
        int[] playerDeckB2 = {1, 5, 5, 1};

        int[] playerDeckA3 = {3, 2, 8};
        int[] playerDeckB3 = {5, 7, 1};

        int[] playerDeckA4 = {10, 9, 12, 7, 3};
        int[] playerDeckB4 = {6, 10, 8, 9, 5};

        int[] playerDeckA5 = {5, 4, 6, 5};
        int[] playerDeckB5 = {1, 9, 9, 1};

        int result1 = solution(playerDeckA, playerDeckB);

        int result2 = solution(playerDeckA2, playerDeckB2);

        int result3 = solution(playerDeckA3, playerDeckB3);

        int result4 = solution(playerDeckA4, playerDeckB4);

        int result5 = solution(playerDeckA5, playerDeckB5);


        System.out.println("Result 1: Expected result: 26 - Your result: "+result1);
        System.out.println("Result 2: Expected result: 12 - Your result: "+result2);
        System.out.println("Result 2: Expected result: 9  - Your result: "+result3);
        System.out.println("Result 4: Expected result: 13 - Your result: "+result4);
        System.out.println("Result 5: Expected result: 8  - Your result: "+result5);

    }
}
