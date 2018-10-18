//
// Created by chise on 27-Sep-18.
//

#include "BracketsChecker.h"

bool BracketsChecker::isOpeningBracket(char c) {
    return c == '(' || c == '[' || c == '{';
}

bool BracketsChecker::isClosingBracket(char c) {
    return c == ')' || c == '}' || c == ']';
}

bool BracketsChecker::isClosingPair(char open, char close) {
    return (open == '(' && close == ')') ||
           (open == '[' && close == ']') ||
           (open == '{' && close == '}');
}

bool BracketsChecker::checkBrackets() {
    for (int i = 0; i < line.length(); i++) {
        if (isOpeningBracket(line[i])) {
            stack.push(line[i]);
        } else if (isClosingBracket(line[i])) {
            if (!isClosingPair(stack.pop(), line[i])) {
                return false;
            }
        }
    }
    return stack.isEmpty();
}

BracketsChecker::BracketsChecker() {

}

BracketsChecker::BracketsChecker(std::string s) {
    line = s;
}
