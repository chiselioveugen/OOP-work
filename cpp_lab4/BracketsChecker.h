//
// Created by chise on 27-Sep-18.
//

#ifndef C_BRACKETSCHECKER_H
#define C_BRACKETSCHECKER_H


#include <xstring>
#include "MyStack.h"

class BracketsChecker {
private:
    std::string line;
    MyStack stack;
    bool isOpeningBracket(char c);
    bool isClosingBracket(char c);
    bool isClosingPair(char open, char close);
public:
    BracketsChecker();
    BracketsChecker(std::string s);
    bool checkBrackets();
};


#endif //C_BRACKETSCHECKER_H
