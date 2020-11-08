package Problem1;

import java.util.Stack;

public class ReverseStack {
    public static void reverseStack(Stack<Integer> stack) {
        if(stack.isEmpty()) {
            return;
        }
        int temp = stack.pop();
        reverseStack(stack);
        reverseHelper(stack, temp);
    }

    private static void reverseHelper(Stack<Integer> stack, int temp) {
        if(stack.isEmpty()) {
            stack.push(temp);
            return;
        }
        int top = stack.pop();
        reverseHelper(stack, temp);
        stack.push(top);

    }
}