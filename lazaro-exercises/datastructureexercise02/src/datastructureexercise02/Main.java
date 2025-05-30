package datastructureexercise02;

//Contexto: Você tem duas listas: tempos[]: tempo que diferentes máquinas levam para produzir uma unidade (em horas, ponto flutuante).
//custos[]: custo por hora de cada máquina (em reais, ponto flutuante).
//Queremos descobrir qual máquina é mais eficiente em custo por unidade produzida — ou seja, a máquina que tem o menor custo total por unidade produzida, calculado como:
// custo total(eficiencia da máquina) =  tempo * custoHora
// Se houver empate do menor custo, escolha a máquina com o menor índice.
//Question: Dado dois arrays double[] tempos e double[] custos, cada um de tamanho N, retorne o índice da máquina que produz com o menor custo total por unidade.
public class Main {

    static int solution(double[] tempos, double[] custos){
        int menorIndex = 0;
        double custoAntes = tempos[0] * custos[0];
        for (int i = 0; i< tempos.length; i++){
            double custoAgora = tempos[i] * custos[i];
            if (custoAgora< custoAntes){
                custoAntes = custoAgora;
                menorIndex = i;
            }
        }

        return menorIndex;
    }

    public static void main(String[] args) {
        double[] tempos = {2.5, 3.0, 1.5, 2.0};
        double[] custos = {10.0, 12.0, 20.0, 9.0};

        double[] tempos2 = {2.0, 4.0, 1.5, 2.0};
        double[] custos2 = {10.0, 5.0, 15.0, 10.0};

        double[] tempos3 = {3.0, 2.0, 8.0};
        double[] custos3 = {5.0, 7.0, 1.0};

        double[] tempos4 = {2.5, 0.9, 1.2, 1.8, 3.0};
        double[] custos4 = {6.0, 12.0, 8.0, 9.0, 5.0};

        double[] tempos5 = {0.5, 0.4, 0.6, 0.45};
        double[] custos5 = {10.0, 11.0, 9.0, 10.0};

        int result1 = solution(tempos, custos);

        int result2 = solution(tempos2, custos2);

        int result3 = solution(tempos3, custos3);

        int result4 = solution(tempos4, custos4);

        int result5 = solution(tempos5, custos5);


        System.out.println("Result 1: Expected result: 3 - Your result: "+result1);
        System.out.println("Result 2: Expected result: 0 - Your result: "+result2);
        System.out.println("Result 2: Expected result: 2 - Your result: "+result3);
        System.out.println("Result 4: Expected result: 2 - Your result: "+result4);
        System.out.println("Result 5: Expected result: 1 - Your result: "+result5);

    }
}
