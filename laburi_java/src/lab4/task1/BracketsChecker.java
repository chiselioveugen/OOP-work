package lab4.task1;

public class BracketsChecker {
    private String line;
    private MyStack stack;
    BracketsChecker() {
        line = "";
    }
    BracketsChecker(String s) {
        line = s;
    }

    public boolean checkBrackets() {
        stack = new MyStack();
        for (int i = 0; i < line.length(); i++) {
            if (isOpeningBracket(line.charAt(i))) {
                stack.push(line.charAt(i));
            } else if (isClosingBracket(line.charAt(i))) {
                if (!isClosingPair(stack.pop(), line.charAt(i))) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean isOpeningBracket(char c) {
        return c == '(' || c == '[' || c == '{';
    }

    private boolean isClosingBracket(char c) {
        return c == ')' || c == '}' || c == ']';
    }

    private boolean isClosingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }
}
