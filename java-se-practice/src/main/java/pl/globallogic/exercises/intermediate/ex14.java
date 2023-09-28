package pl.globallogic.exercises.intermediate;

public class ex14 {
//Numbers of days in month

        public static boolean isLeapYear(int year) {
            if (year < 1 || year > 9999) {
                return false;
            }

            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                return true;
            }

            return false;
        }

        public static int getDaysInMonth(int month, int year) {
            if (month < 1 || month > 12 || year < 1 || year > 9999) {
                return -1;
            }

            int[] daysInMonth = {
                    31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
            };

            if (month == 2 && isLeapYear(year)) {
                return 29;
            }

            return daysInMonth[month - 1];
        }

        public static void main(String[] args) {
            System.out.println(isLeapYear(-1600));  // Output: false
            System.out.println(isLeapYear(1600));   // Output: true
            System.out.println(isLeapYear(2017));   // Output: false
            System.out.println(isLeapYear(2000));   // Output: true

            System.out.println(getDaysInMonth(1, 2020));   // Output: 31
            System.out.println(getDaysInMonth(2, 2020));   // Output: 29
            System.out.println(getDaysInMonth(2, 2018));   // Output: 28
            System.out.println(getDaysInMonth(-1, 2020));  // Output: -1
            System.out.println(getDaysInMonth(1, -2020));  // Output: -1
        }
    }


