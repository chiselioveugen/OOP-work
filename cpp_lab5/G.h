//
// Created by chise on 04-Oct-18.
//

#ifndef CPP_LAB5_G_H
#define CPP_LAB5_G_H


#include "F.h"

#include <string>

class G: public F {
protected:
    std::string g;
public:
    G() {
        g = "g";
    }
    G(std::string str, X x) : F(str, x) {
        g = str;
    }
    void print() {
        F::print();
        std::cout << g.c_str() << "(" << x.toString() << ")";
    }
};


#endif //CPP_LAB5_G_H
