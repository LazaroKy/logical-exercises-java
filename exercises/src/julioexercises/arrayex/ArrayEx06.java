package julioexercises.arrayex;

public class ArrayEx06 {
    public static void main(String[] args) {

        int[] array = {12, 15, 18, 20, 23, 25, 27, 30, 33, 35,
                38, 40, 42, 45, 48, 50, 53, 55, 58, 60};

        int evenNumbers = 0;
        int oddNumbers = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                evenNumbers++;
            } else  {
                oddNumbers++;
            }
        }

        System.out.println("Amount of even numbers: " + evenNumbers);
        System.out.println("Amount of odd numbers: " + oddNumbers);

    }
}
