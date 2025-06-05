package chatchallenge01;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,3};

        System.out.println("Result: "+ balancedSum(numbers));
    }

    public static String balancedSum(int[] array){
        int sumNumbersLeft= 0;
        int sumNumbersRight;

        int sumTotal = 0;
        for (int number : array){
            sumTotal += number;
        }
        for (int number : array) {
            sumNumbersRight = -sumNumbersLeft + sumTotal - number;
            if (sumNumbersLeft == sumNumbersRight) {
                 return "YES";
            }
            sumNumbersLeft += number;
        }
        return "NO";
    }
}

//all numbers to the right are all elements minus the number at the index and the numbers to the left of the number at the index