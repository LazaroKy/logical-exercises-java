package julioexercises.arrayex;

public class ArrayEx03 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int biggestValue = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (biggestValue < array[i]) {
                biggestValue = array[i];
            }
        }

        System.out.println("Array biggest value: " + biggestValue);
    }
}
