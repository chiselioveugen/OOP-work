//
// Created by chise on 27-Sep-18.
//

#ifndef C_MYSTACK_H
#define C_MYSTACK_H


#include <xstring>

class MyStack {
private:
    std::string stack;
    bool isFull();
    int maxSize;
public:
    int size();
    void push(char c);
    char pop();
    MyStack();
    MyStack(std::string s);
    void print();
    bool isEmpty();
};


#endif //C_MYSTACK_H
