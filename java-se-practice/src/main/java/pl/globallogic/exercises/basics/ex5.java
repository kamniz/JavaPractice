package pl.globallogic.exercises.basics;

    public class ex5{
        //Lapyearcalculator

        public static boolean isLeapYear(int year) {
            if (year < 1 || year > 9999) {
                return false;
            }

            boolean divisibleBy4 = year % 4 == 0;
            boolean divisibleBy100 = year % 100 == 0;
            boolean divisibleBy400 = year % 400 == 0;

            if (divisibleBy4) {
                if (divisibleBy100) {
                    return divisibleBy400;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }

        public static void main(String[] args) {
            System.out.println(isLeapYear(-1600)); // false
            System.out.println(isLeapYear(1600));  // true
            System.out.println(isLeapYear(2017));  // false
            System.out.println(isLeapYear(2000));  // true
        }
    }


