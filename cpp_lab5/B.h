//
// Created by chise on 04-Oct-18.
//

#ifndef CPP_LAB5_B_H
#define CPP_LAB5_B_H


#include "A.h"

#include <string>

class B: public A {
protected:
    std::string b;
public:
    B() {
        b = "b";
    }
    B(std::string str, X x) : A(str, x) {
        b = str;
    }
    void print() {
        A::print();
        std::cout << b.c_str() << "(" << x.toString() << ")";
    }
};


#endif //CPP_LAB5_B_H
