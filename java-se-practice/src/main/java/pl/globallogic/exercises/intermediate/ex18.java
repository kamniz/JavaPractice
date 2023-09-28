package pl.globallogic.exercises.intermediate;

public class ex18 {
//Even Digit Sum

        public static int getEvenDigitSum(int number) {
            if (number < 0) {
                return -1;
            }

            int evenDigitSum = 0;

            while (number > 0) {
                int digit = number % 10;
                if (digit % 2 == 0) {
                    evenDigitSum += digit;
                }
                number /= 10;
            }

            return evenDigitSum;
        }

        public static void main(String[] args) {
            System.out.println(getEvenDigitSum(123456789));   // Output: 20
            System.out.println(getEvenDigitSum(252));         // Output: 4
            System.out.println(getEvenDigitSum(-22));         // Output: -1
        }
    }


