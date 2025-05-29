package datastructureexercise01;

//A Universidade X está oferecendo uma única bolsa de estudos para um entre seus alunos. Cada aluno possui duas informações associadas:
//Sua pontuação acadêmica (de 0 a 100), representando seu desempenho. Sua renda familiar mensal (em reais), um valor positivo.
//A ideia da universidade é premiar o aluno cujo desempenho é mais notável em relação à sua renda. Para isso, define-se um índice de justiça como:
// justiça = pontuação / renda
//O aluno com o maior índice de justiça deve ser escolhido. Caso haja empate, o aluno de mais antigo na lista, que chegou primeiro, deve ser escolhido.

import java.util.Arrays;

public class Main {

    static int solution(int[]rendas, int[]pontucoes){
        int menorIndex = 0;
        double justica= 0;
        double valueBefore =0;
        for(int i = 0; i< rendas.length; i++){
            justica = (double) pontucoes[i] / rendas[i];
            if (justica> valueBefore){
                valueBefore = justica;
                menorIndex = i;
            }
        }
        return menorIndex;
    }

    public static void main(String[] args) {
        // Exemplo de entrada (você pode adaptar para entrada via Scanner se quiser)
        int[] rendas =    {1200,800,600,1500};
        int[] pontuacoes = {90,80,70,85};

        int result = solution(rendas, pontuacoes);

        int[] pontuacoes1 = {88,76,92,85,95,90};
        int[] rendas1 = {1000,800,1100,950,1500,700};
        int result1 = solution(rendas1, pontuacoes1);

        int[] rendas2 =      {1000, 500, 600, 1200, 700, 800};
        int[] pontuacoes2 =  {80,   40,  72,  85,   84,  64};
        int result2 = solution(rendas2, pontuacoes2);

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }
}
