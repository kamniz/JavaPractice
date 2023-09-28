package pl.globallogic.exercises.basics;

public class ex9 {

//AreaCalculator

        public static double area(double radius) {
            if (radius < 0) {
                return -1.0;
            }
            return radius * radius * Math.PI;
        }

        public static double area(double x, double y) {
            if (x < 0 || y < 0) {
                return -1.0;
            }
            return x * y;
        }

        public static void main(String[] args) {
            System.out.println("Circle Area: " + area(5.0));
            System.out.println("Invalid Circle Area: " + area(-1.0));
            System.out.println("Rectangle Area: " + area(5.0, 4.0));
            System.out.println("Invalid Rectangle Area: " + area(-1.0, 4.0));
        }
    }


