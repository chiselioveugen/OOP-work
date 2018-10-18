//
// Created by chise on 04-Oct-18.
//

#ifndef CPP_LAB5_I_H
#define CPP_LAB5_I_H

#include "H.h"

#include <string>

class I: public H {
protected:
    std::string i;
public:
    I() {
        i = "i";
    }
    I(std::string str, X x) : H(str, x) {
        i = str;
    }
    void print() {
        H::print();
        std::cout << i.c_str() << "(" << x.toString() << ")";
    }
};

#endif //CPP_LAB5_I_H
