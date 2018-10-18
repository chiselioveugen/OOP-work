//
// Created by chise on 04-Oct-18.
//

#ifndef CPP_LAB5_C_H
#define CPP_LAB5_C_H

#include "B.h"

#include <string>

class C: public B {
protected:
    std::string c;
public:
    C() {
        c = "c";
    }
    C(std::string str, X x) : B(str, x) {
        c = str;
    }
    void print() {
        B::print();
        std::cout << c.c_str() << "(" << x.toString() << ")";
    }
};



#endif //CPP_LAB5_C_H
