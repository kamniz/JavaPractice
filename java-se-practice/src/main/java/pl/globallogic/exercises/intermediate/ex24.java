package pl.globallogic.exercises.intermediate;

public class ex24 {
//Number to words

        public static void numberToWords(int number) {
            if (number < 0) {
                System.out.println("Invalid Value");
                return;
            }

            int reversed = reverse(number);
            int originalDigitCount = (number == 0) ? 1 : (int) Math.log10(number) + 1;
            int reversedDigitCount = (reversed == 0) ? 1 : (int) Math.log10(reversed) + 1;

            while (reversed > 0) {
                int digit = reversed % 10;
                switch (digit) {
                    case 0:
                        System.out.print("Zero ");
                        break;
                    case 1:
                        System.out.print("One ");
                        break;
                    case 2:
                        System.out.print("Two ");
                        break;
                    case 3:
                        System.out.print("Three ");
                        break;
                    case 4:
                        System.out.print("Four ");
                        break;
                    case 5:
                        System.out.print("Five ");
                        break;
                    case 6:
                        System.out.print("Six ");
                        break;
                    case 7:
                        System.out.print("Seven ");
                        break;
                    case 8:
                        System.out.print("Eight ");
                        break;
                    case 9:
                        System.out.print("Nine ");
                        break;
                }
                reversed /= 10;
            }

            int zeroesToAdd = originalDigitCount - reversedDigitCount;
            for (int i = 0; i < zeroesToAdd; i++) {
                System.out.print("Zero ");
            }
        }

        public static int reverse(int number) {
            int reversed = 0;

            while (number != 0) {
                int lastDigit = number % 10;
                reversed = reversed * 10 + lastDigit;
                number /= 10;
            }

            return reversed;
        }

        public static void main(String[] args) {
            numberToWords(123);    // Output: One Two Three
            numberToWords(1010);   // Output: One Zero One Zero
            numberToWords(1000);   // Output: One Zero Zero Zero
            numberToWords(-12);    // Output: Invalid Value
        }
    }


