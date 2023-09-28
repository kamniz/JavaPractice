package pl.globallogic.exercises.intermediate;

public class ex26 {
//Largest Prime

        public static int getLargestPrime(int number) {
            if (number <= 1) {
                return -1;
            }

            int largestPrime = -1;
            while (number % 2 == 0) {
                largestPrime = 2;
                number /= 2;
            }

            for (int i = 3; i <= Math.sqrt(number); i += 2) {
                while (number % i == 0) {
                    largestPrime = i;
                    number /= i;
                }
            }

            if (number > 2) {
                largestPrime = number;
            }

            return largestPrime;
        }

        public static void main(String[] args) {
            // Example usage
            System.out.println(getLargestPrime(21));
            System.out.println(getLargestPrime(217));
            System.out.println(getLargestPrime(0));
            System.out.println(getLargestPrime(45));
            System.out.println(getLargestPrime(-1));
        }
    }


