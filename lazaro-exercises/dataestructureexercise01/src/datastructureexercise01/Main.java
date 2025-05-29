package datastructureexercise01;

//A Universidade X está oferecendo uma única bolsa de estudos para um entre seus alunos. Cada aluno possui duas informações associadas:
//Sua pontuação acadêmica (de 0 a 100), representando seu desempenho. Sua renda familiar mensal (em reais), um valor positivo.
//A ideia da universidade é premiar o aluno cujo desempenho é mais notável em relação à sua renda. Para isso, define-se um índice de justiça como:
// justiça = pontuação / renda
//O aluno com o maior índice de justiça deve ser escolhido. Caso haja empate, o aluno de mais antigo na lista, que chegou primeiro, deve ser escolhido.

public class Main {

    static int solution(int[]proteinas, int[]gorduraTotais){


        return 0;
    }

    public static void main(String[] args) {
        // Exemplo de entrada (você pode adaptar para entrada via Scanner se quiser)
        int[] rendas =    {1200,800,600,1500};
        int[] pontuacoes = {90,80,70,85};

        int result = solution(rendas, pontuacoes);

        System.out.println(result);
    }
}
