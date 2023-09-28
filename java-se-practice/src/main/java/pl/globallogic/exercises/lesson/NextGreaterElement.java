package pl.globallogic.exercises.lesson;

import java.util.Stack;

public class NextGreaterElement {
    // input: {1,3,4,2,5,3,2,10,5,11}
    // return next greater element for each array element
    public static void main(String[]args) {
        int[] input = {1,3,4,2,5,3,2,10,5,11};
        findNextGreaterElementFor(input);
    }

    private static void findNextGreaterElementFor(int[] input){
            int nextGreaterElement;
            for (int i = 0; i < input.length; i++){
                nextGreaterElement = -1;
                for (int j = i + 1; j < input.length; j++){
                    if (input[i] < input[j]){
                        nextGreaterElement = input[j];
                        break;
                    }
                }
                System.out.printf("For %s next greater is %s \n", input[i], nextGreaterElement);
            }
    }

    private static void findNextGreaterElemntStack(int[] input) {
        Stack<Integer> stack = new Stack<>();
        stack.push(input[0]);
        int next, popped;
        for (int i = 1; i < input.length; i++){
            next = input[i];
            if (!stack.isEmpty()){
                popped = stack.pop();
                while (popped < next){
                    System.out.printf("For %s next greater is %s \n", popped, next);
                    if (stack.isEmpty()) break;
                    popped = stack.pop();


                }
                if (popped > next) stack.push(popped);

            }
            stack.push(next);

        }
        while (!stack.isEmpty()){
            System.out.printf("For %s next greater is %s \n", stack.pop(), -1);
        }
    }
}
