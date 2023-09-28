package pl.globallogic.exercises.intermediate;
import java.util.Scanner;
public class ex27 {
//input calculator1

        public static void inputThenPrintSumAndAverage() {
            Scanner scanner = new Scanner(System.in);
            int sum = 0;
            int count = 0;

            while (true) {
                boolean isAnInt = scanner.hasNextInt();

                if (isAnInt) {
                    int number = scanner.nextInt();
                    sum += number;
                    count++;
                } else {
                    break;
                }

                scanner.nextLine(); // Clear the newline character
            }

            scanner.close();

            if (count == 0) {
                System.out.println("SUM = 0 AVG = 0");
            } else {
                long average = Math.round((double) sum / count);
                System.out.println("SUM = " + sum + " AVG = " + average);
            }
        }

        public static void main(String[] args) {
            inputThenPrintSumAndAverage();
        }
    }


