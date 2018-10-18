//
// Created by chise on 04-Oct-18.
//

#ifndef CPP_LAB5_E_H
#define CPP_LAB5_E_H


#include "D.h"

#include <string>

class E: public D {
protected:
    std::string e;
public:
    E() {
        e = "e";
    }
    E(std::string str, X x) : D(str, x) {
        e = str;
    }
    void print() {
        D::print();
        std::cout << e.c_str() << "(" << x.toString() << ")";
    }
};

#endif //CPP_LAB5_E_H
