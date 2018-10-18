//
// Created by chise on 04-Oct-18.
//

#ifndef CPP_LAB5_H_H
#define CPP_LAB5_H_H

#include "G.h"

#include <string>

class H: public G {
protected:
    std::string h;
public:
    H() {
        h = "h";
    }
    H(std::string str, X x) : G(str, x) {
        h = str;
    }
    void print() {
        G::print();
        std::cout << h.c_str() << "(" << x.toString() << ")";
    }
};


#endif //CPP_LAB5_H_H
