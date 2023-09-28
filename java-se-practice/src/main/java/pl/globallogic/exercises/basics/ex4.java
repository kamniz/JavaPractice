package pl.globallogic.exercises.basics;

public class ex4 {
    //barkingdog
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false; // return false jesli hourOfDay jest mniejsza jak 0 albo wieksza jak 23
        } else if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
            return true; // return true jesli pies bedzie szczekal i jest przed 8 albo po 22
        } else {
            return false; // wszystkie inne przypadki return false
        }
    }

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1)); 
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
    }
}
