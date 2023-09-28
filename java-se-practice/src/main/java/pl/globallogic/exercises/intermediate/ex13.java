package pl.globallogic.exercises.intermediate;

public class ex13 {
    //Number In Word

        public static void printNumberInWord(int number) {
            String[] words = {
                    "ZERO", "ONE", "TWO", "THREE", "FOUR",
                    "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"
            };

            if (number >= 0 && number <= 9) {
                System.out.println(words[number]);
            } else {
                System.out.println("OTHER");
            }
        }

        public static void main(String[] args) {
            printNumberInWord(5);     // Output: FIVE
            printNumberInWord(9);     // Output: NINE
            printNumberInWord(-3);    // Output: OTHER
        }
    }
