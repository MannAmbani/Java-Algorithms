package Stack;

import java.util.Stack;

public class StackAlgorithm {
    public static void main(String[] args) {
        // basics();
        // printNextGreaterElement(new int[]{16,7,2,15});
        hasMatchingParenthesesInput();
    }

    public static void basics(){
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

    public static void printNextGreaterElement(int[] arr){
        if (arr.length == 0) {
            System.out.println();
            return;
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);

        for(int i = 1; i<arr.length ; i++){
            int next = arr[i];
            if (!stack.isEmpty()) {
                int popped = stack.pop();
                while (popped < next) {
                    System.out.println(popped + " --> "+next);
                    if(stack.isEmpty()){
                        break;
                    }
                    popped = stack.pop();
                }

                if (popped > next) {
                    stack.push(popped);
                }

            }
            stack.push(next);
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop() + " --> "+-1);
        }
    }

    public static void hasMatchingParenthesesInput(){
        System.out.println(hasMatchingParentheses("((algorithm()))"));
        System.out.println(hasMatchingParentheses("()(algorithm())"));
        System.out.println(hasMatchingParentheses("((algorithm))"));
        System.out.println(hasMatchingParentheses("(algorithm)"));

        System.out.println();

        System.out.println(hasMatchingParentheses("(algorithm("));
        System.out.println(hasMatchingParentheses(")algorithm)"));
        System.out.println(hasMatchingParentheses(")algorithm("));
        System.out.println(hasMatchingParentheses("algorithm(("));
        System.out.println(hasMatchingParentheses("(algorithm"));
        System.out.println(hasMatchingParentheses("((algorithm)"));

        System.out.println();

        System.out.println(hasMatchingParenthesesWithInt("((algorithm()))"));
        System.out.println(hasMatchingParenthesesWithInt("()(algorithm())"));
        System.out.println(hasMatchingParenthesesWithInt("((algorithm))"));
        System.out.println(hasMatchingParenthesesWithInt("(algorithm)"));

        System.out.println();

        System.out.println(hasMatchingParenthesesWithInt("(algorithm("));
        System.out.println(hasMatchingParenthesesWithInt(")algorithm)"));
        System.out.println(hasMatchingParenthesesWithInt(")algorithm("));
        System.out.println(hasMatchingParenthesesWithInt("algorithm(("));
        System.out.println(hasMatchingParenthesesWithInt("(algorithm"));
        System.out.println(hasMatchingParenthesesWithInt("((algorithm)"));

    }

    public static boolean hasMatchingParentheses(String s){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length() ; i++){
            char current = s.charAt(i);
            if (current == '(') {
                stack.push(current);
            }else if (current == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }else{
                  return false;  
                }
            }
        }
        return stack.isEmpty(); 
    }

    public static boolean hasMatchingParenthesesWithInt(String s){
        int matchingSymbolTracker = 0;
        for(int i = 0; i < s.length() ; i++){
            char current = s.charAt(i);
            if (current == '(') {
                matchingSymbolTracker++;
            }else if (current == ')') {
                if (matchingSymbolTracker > 0) {
                   matchingSymbolTracker--;
                }else{
                  return false;  
                }
            }
        }

        return matchingSymbolTracker == 0;
    }
}
