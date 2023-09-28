package pl.globallogic.exercises.intermediate;

public class ex23 {
//Perfect Number

        public static boolean isPerfectNumber(int number) {
            if (number < 1) {
                return false;
            }

            int sumOfDivisors = 0;
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sumOfDivisors += i;
                }
            }

            return sumOfDivisors == number;
        }

        public static void main(String[] args) {
            System.out.println(isPerfectNumber(6));    // Output: true
            System.out.println(isPerfectNumber(28));   // Output: true
            System.out.println(isPerfectNumber(5));    // Output: false
            System.out.println(isPerfectNumber(-1));   // Output: false
        }
    }


