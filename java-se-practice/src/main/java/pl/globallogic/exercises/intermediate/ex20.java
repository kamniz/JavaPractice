package pl.globallogic.exercises.intermediate;

public class ex20 {
//Last Digit Checker

        public static boolean hasSameLastDigit(int num1, int num2, int num3) {
            if (!isValid(num1) || !isValid(num2) || !isValid(num3)) {
                return false;
            }

            int lastDigit_num1 = num1 % 10;
            int lastDigit_num2 = num2 % 10;
            int lastDigit_num3 = num3 % 10;

            return (lastDigit_num1 == lastDigit_num2) ||
                    (lastDigit_num1 == lastDigit_num3) ||
                    (lastDigit_num2 == lastDigit_num3);
        }

        public static boolean isValid(int number) {
            return number >= 10 && number <= 1000;
        }

        public static void main(String[] args) {
            System.out.println(hasSameLastDigit(41, 22, 71));   // Output: true
            System.out.println(hasSameLastDigit(23, 32, 42));   // Output: true
            System.out.println(hasSameLastDigit(9, 99, 999));   // Output: false

            System.out.println(isValid(10));   // Output: true
            System.out.println(isValid(468));  // Output: true
            System.out.println(isValid(1051)); // Output: false
        }
    }


