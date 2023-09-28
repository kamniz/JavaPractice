package pl.globallogic.exercises.basics;

public class Capitalized {

        public static void main(String[] args) {
            String input = "i love java";
            String capitalized = capitalizeFirstLetter(input);
            System.out.println(capitalized);
        }

        public static String capitalizeFirstLetter(String input) {
            StringBuilder result = new StringBuilder();
            boolean capitalizeNext = true;

            for (char c : input.toCharArray()) {
                if (Character.isWhitespace(c)) {
                    capitalizeNext = true;
                    result.append(c);
                } else if (capitalizeNext) {
                    result.append(Character.toUpperCase(c));
                    capitalizeNext = false;
                } else {
                    result.append(Character.toLowerCase(c));
                }
            }

            return result.toString();
        }
    }

