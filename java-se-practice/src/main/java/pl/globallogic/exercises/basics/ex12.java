package pl.globallogic.exercises.basics;

public class ex12 {
//Playing Cat

        public static boolean isCatPlaying(boolean summer, int temperature) {
            int upperLimit = (summer) ? 45 : 35;

            return (temperature >= 25 && temperature <= upperLimit);
        }

        public static void main(String[] args) {
            System.out.println(isCatPlaying(true, 10)); // false
            System.out.println(isCatPlaying(false, 36)); // false
            System.out.println(isCatPlaying(false, 35)); // true
        }
    }


