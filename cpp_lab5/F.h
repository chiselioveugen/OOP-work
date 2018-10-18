//
// Created by chise on 04-Oct-18.
//

#ifndef CPP_LAB5_F_H
#define CPP_LAB5_F_H


#include "E.h"

#include <string>

class F: public E {
protected:
    std::string f;
public:
    F() {
        f = "f";
    }
    F(std::string str, X x) : E(str, x) {
        f = str;
    }
    void print() {
        E::print();
        std::cout << f.c_str() << "(" << x.toString() << ")";
    }
};
#endif //CPP_LAB5_F_H
