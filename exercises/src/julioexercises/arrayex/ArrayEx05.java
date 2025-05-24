package julioexercises.arrayex;

public class ArrayEx05 {
    public static void main(String[] args) {

        int[] arrayX = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] arrayY = new int[arrayX.length];

        System.out.print("ArrayY: ");
        for (int i = 0; i < arrayX.length; i++) {
            arrayY[i] = arrayX[i];
            System.out.print(arrayY[i] + ", ");
        }

    }
}
