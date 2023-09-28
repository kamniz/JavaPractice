package pl.globallogic.exercises.basics;

public class ex8 {
    //TeenNumberChecker

    public static boolean hasTeen(int num1, int num2, int num3) {
        return isTeen(num1) || isTeen(num2) || isTeen(num3);
    }

    public static boolean isTeen(int number) {
        return number >= 13 && number <= 19;
    }

    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));  // true
        System.out.println(hasTeen(23, 15, 42)); // true
        System.out.println(hasTeen(22, 23, 34)); // false

        System.out.println(isTeen(9));  // false
        System.out.println(isTeen(13)); // true
    }
}
