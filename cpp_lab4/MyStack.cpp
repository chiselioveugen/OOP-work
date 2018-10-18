//
// Created by chise on 27-Sep-18.
//

#include <iostream>
#include "MyStack.h"

int MyStack::size() {
    return stack.size();
}

void MyStack::push(char c) {
    stack = stack + c;
}

char MyStack::pop() {
    if (stack.size() == 0)
        return 0;
    char c = stack[stack.size() - 1];
    stack = stack.substr(0, stack.size() - 1);
    return c;
}

bool MyStack::isFull() {
    return size() == maxSize;
}

bool MyStack::isEmpty() {
    return size() == 0;
}

MyStack::MyStack(std::string s) {

}

MyStack::MyStack() {

}

void MyStack::print() {
    std::cout << stack.c_str() << std::endl;
}
