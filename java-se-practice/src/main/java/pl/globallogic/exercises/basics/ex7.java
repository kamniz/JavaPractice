package pl.globallogic.exercises.basics;

public class ex7 {
//EqualSumChecker

        public static boolean hasEqualSum(int num1, int num2, int sum) {
            return (num1 + num2) == sum;
        }

        public static void main(String[] args) {
            System.out.println(hasEqualSum(1, 1, 1));  // false
            System.out.println(hasEqualSum(1, 1, 2));  // true
            System.out.println(hasEqualSum(1, -1, 0)); // true
        }
    }


