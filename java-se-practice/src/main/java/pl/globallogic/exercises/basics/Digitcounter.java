package pl.globallogic.exercises.basics;

import java.util.Scanner;

public class Digitcounter {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the nubmer to count  its digits: ");
        int number = scanner.nextInt();
        System.out.println("Digit count for" + number + "is equal to" + numberOfDigits(number));
        System.out.println(numberOfDigits(12345) == 5);
        System.out.println(numberOfDigits(8866312) == 8);
        System.out.println(numberOfDigits(-187) == -1);
    }
    private  static int numberOfDigits(int targetNumber) {
        if ( targetNumber <0 )
            return -1;
        int counter = 0;
        while (targetNumber >0){
            targetNumber = targetNumber /10;
            counter++;
        }

        return counter;

    }
}
