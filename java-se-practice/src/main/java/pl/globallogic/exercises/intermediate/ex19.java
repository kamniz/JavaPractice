package pl.globallogic.exercises.intermediate;

public class ex19 {
//Share Digit

        public static boolean hasSharedDigit(int num1, int num2) {
            if (!isValidRange(num1) || !isValidRange(num2)) {
                return false;
            }

            int digit1_num1 = num1 % 10;
            int digit2_num1 = num1 / 10;
            int digit1_num2 = num2 % 10;
            int digit2_num2 = num2 / 10;

            return (digit1_num1 == digit1_num2) ||
                    (digit1_num1 == digit2_num2) ||
                    (digit2_num1 == digit1_num2) ||
                    (digit2_num1 == digit2_num2);
        }

        public static boolean isValidRange(int number) {
            return number >= 10 && number <= 99;
        }

        public static void main(String[] args) {
            System.out.println(hasSharedDigit(12, 23));   // Output: true
            System.out.println(hasSharedDigit(9, 99));    // Output: false
            System.out.println(hasSharedDigit(15, 55));   // Output: true
        }
    }


