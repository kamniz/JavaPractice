package pl.globallogic.exercises.intermediate;

import java.util.Scanner;
import java.util.Arrays;
// hm no nie wiem jak to lepeij zrobic, problem taki ze jak wezmiemy size of the array np 100 to potem trzeba wpisac 100 recznie, moze sproboje to jakos pozniej zautomatyzowac
    public class  ex41{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            int[] unsortedArray = getIntegers(size);
            System.out.println("Entered Array:");
            printArray(unsortedArray);

            int[] sortedArray = sortIntegers(unsortedArray);
            System.out.println("\nSorted Array in Descending Order:");
            printArray(sortedArray);

            scanner.close();
        }

        public static int[] getIntegers(int size) {
            Scanner scanner = new Scanner(System.in);
            int[] array = new int[size];
            System.out.println("Enter " + size + " integers:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }
            return array;
        }

        public static void printArray(int[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.println("Element " + i + " contents " + array[i]);
            }
        }

        public static int[] sortIntegers(int[] array) {
            int[] sortedArray = Arrays.copyOf(array, array.length);
            Arrays.sort(sortedArray);
            int[] descendingArray = new int[array.length];
            int index = 0;
            for (int i = sortedArray.length - 1; i >= 0; i--) {
                descendingArray[index] = sortedArray[i];
                index++;
            }
            return descendingArray;
        }
    }


