package Stack;

import java.util.Stack;

public class StackAlgorithm {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        System.out.println("START Main");
        stack.push("Main");
        System.out.println("START Builder");
        stack.push("Builder");
        System.out.println("START External Server");
        stack.push("external-service");
        System.out.println("End " + stack.pop());
        System.out.println("START parse-external-data");
        stack.push("parse-external-data");
        System.out.println("Peek " + stack.peek());
        System.out.println("End " + stack.pop());
        System.out.println("End " + stack.pop());
        System.out.println("End " + stack.pop());

    }
}
