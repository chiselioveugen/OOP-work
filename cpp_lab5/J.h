//
// Created by chise on 04-Oct-18.
//

#ifndef CPP_LAB5_J_H
#define CPP_LAB5_J_H

#include "I.h"

#include <string>

class J: public I {
protected:
    std::string j;
public:
    J() {
        j = "j";
    }
    J(std::string str, X x) : I(str, x) {
        j = str;
    }
    void print() {
        I::print();
        std::cout << j.c_str() << "(" << x.toString() << ")";
    }
};


#endif //CPP_LAB5_J_H
