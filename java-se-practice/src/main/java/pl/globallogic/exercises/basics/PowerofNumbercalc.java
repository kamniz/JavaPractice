package pl.globallogic.exercises.basics;

import java.util.Scanner;

public class PowerofNumbercalc {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the target Base");
        int base = scanner.nextInt();
        System.out.println("Enter the target power");
        int power = scanner.nextInt();
        System.out.println("Number " + base + "in power" + power + "is equal" + calculatePower(base, power));


    }

    private static long calculatePower(int base, int power) {
        if (power < 0 ) return 0;
        if (power == 0) return 1;
        int result = 1;
        for (int i = 1; i <= power; i++){
            result *= base;

        }
        return  result;
    }
}
