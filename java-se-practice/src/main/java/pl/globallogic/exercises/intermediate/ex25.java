package pl.globallogic.exercises.intermediate;

public class ex25 {
//FlourPackProblem

        public static boolean canPack(int bigCount, int smallCount, int goal) {
            if (bigCount < 0 || smallCount < 0 || goal < 0) {
                return false;
            }

            int bigKilos = bigCount * 5;

            if (bigKilos + smallCount < goal) {
                return false;
            }

            return smallCount >= goal % 5;
        }

        public static void main(String[] args) {
            System.out.println(canPack(1, 0, 4));   // Output: false
            System.out.println(canPack(1, 0, 5));   // Output: true
            System.out.println(canPack(0, 5, 4));   // Output: true
            System.out.println(canPack(2, 2, 11));  // Output: true
            System.out.println(canPack(-3, 2, 12)); // Output: false
        }
    }


