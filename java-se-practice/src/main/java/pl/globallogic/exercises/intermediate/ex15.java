package pl.globallogic.exercises.intermediate;

public class ex15 {
//Sum odd

        public static boolean isOdd(int number) {
            if (number <= 0) {
                return false;
            }

            return number % 2 != 0;
        }

        public static int sumOdd(int start, int end) {
            if (start <= 0 || end <= 0 || end < start) {
                return -1;
            }

            int sum = 0;
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }

            return sum;
        }

        public static void main(String[] args) {
            System.out.println(sumOdd(1, 100));      // Output: 2500
            System.out.println(sumOdd(-1, 100));     // Output: -1
            System.out.println(sumOdd(100, 100));    // Output: 0
            System.out.println(sumOdd(13, 13));      // Output: 13
            System.out.println(sumOdd(100, -100));   // Output: -1
            System.out.println(sumOdd(100, 1000));   // Output: 247500
        }
    }


