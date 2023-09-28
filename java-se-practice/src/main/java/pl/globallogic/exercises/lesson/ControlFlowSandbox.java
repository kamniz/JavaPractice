package pl.globallogic.exercises.lesson;


import java.util.Scanner;
import java.util.Objects;


public class ControlFlowSandbox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is ur name?");
        String name = scanner.next();
        String greeting = "";
       /* if (Objects.equals(name,  "Maja")) {
            greeting = "Czesc, " + name;

        }else if (Objects.equals(name, "Chen")) {
            greeting = "Nihao " + name;
        }else {
            greeting = "hello " + name;
        } */


switch (name.trim()){
    case "Chen", "Woo": greeting = "Nihao " + name; break;
    case "Monika":
    case "Maja": greeting = "Czesc " + name; break;
    default: greeting = "Hello, " + name;

}
        System.out.println(greeting);
    }
}
