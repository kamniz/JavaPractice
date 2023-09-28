package pl.globallogic.exercises.intermediate;

public class ex43 {
// nie wiem czy to poprawnie po prostu odwrócilem
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Array = " + java.util.Arrays.toString(array));

        reverse(array);

        System.out.println("Reversed array = " + java.util.Arrays.toString(array));
    }

    public static void reverse(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }
}
