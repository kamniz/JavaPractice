package pl.globallogic.exercises.basics;

public class ex1 {

    //positive negative or zero
    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }

    public static void main(String[] args) {
        checkNumber(15);
        checkNumber(0);
        checkNumber(-15);
    }
}
