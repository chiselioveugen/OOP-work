//
// Created by chise on 04-Oct-18.
//

#ifndef CPP_LAB5_A_H
#define CPP_LAB5_A_H


#include <string>
#include <iostream>
#include "X.h"

class A {
protected:
    std::string a;
    X x = (std::string)"xxx";
public:
    A () {
        a = "a";
    }
    A (std::string str, X &x) {
        a = str;
        this->x = x;
    }
    void print() {
        std::cout << a.c_str() << "(" << x.toString() << ")";
    }
};


#endif //CPP_LAB5_A_H
