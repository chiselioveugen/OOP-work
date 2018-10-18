//
// Created by chise on 04-Oct-18.
//

#ifndef CPP_LAB5_D_H
#define CPP_LAB5_D_H


#include "C.h"

#include <string>

class D: public C {
protected:
    std::string d;
    X x = (std::string) "xyz";
public:
    D() : C() {
        d = "d";
    }
    D(std::string str, X &x) : C(str, x) {
        d = str;
        this->x = x;
    }
    void print() {
        C::print();
        std::cout << d.c_str() << "(" << x.toString() << ")";
    }
};


#endif //CPP_LAB5_D_H
