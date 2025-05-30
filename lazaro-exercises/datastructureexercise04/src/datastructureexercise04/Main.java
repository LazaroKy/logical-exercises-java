package datastructureexercise04;

//Competição de Robôs
//Você tem uma lista de robôs. Cada robô tem: Uma velocidade (em metros por segundo) - Um nível de energia restante (em Joules).
// Todos os robôs vão competir entre si, e queremos saber qual robô vence mais duelos.
//Regras dos duelos: Um robô vence outro se ele tiver Velocidade maior e energia maior do que o adversário.
// Em caso de empate (mesma velocidade ou mesma energia), ele não vence. Cada robô é comparado com todos os outros

public class Main {

    static int solution(int[] velocidades, int[]energia){
        return 0;
    }

    public static void main(String[] args) {
        int[] velocidades1 = {5, 7, 6, 7};
        int[] energias1    = {10, 8, 9, 12};

        int[] velocidades2 = {4, 5, 6, 7};
        int[] energias2    = {9, 8, 7, 6};

        int[] velocidades3 = {3, 8, 4, 6, 7};
        int[] energias3    = {5, 4, 9, 7, 6};

        int[] velocidades4 = {9, 10, 8, 7, 6, 5};
        int[] energias4    = {5, 4, 6, 8, 9, 10};

        int[] velocidades5 = {3, 6, 5, 7, 4, 8};
        int[] energias5    = {6, 5, 7, 4, 8, 3};

        int result1 = solution(velocidades1, energias1);

        int result2 = solution(velocidades2, energias2);

        int result3 = solution(velocidades3, energias3);

        int result4 = solution(velocidades4, energias4);

        int result5 = solution(velocidades5, energias5);

        System.out.println("Result 1: Expected result: 3 - Your result: "+result1);
        System.out.println("Result 2: Expected result: 0 - Your result: "+result2);
        System.out.println("Result 3: Expected result: 2 - Your result: "+result3);
        System.out.println("Result 4: Expected result: 0 - Your result: "+result4);
        System.out.println("Result 5: Expected result: 0 - Your result: "+result5);

    }
}
