//
// Created by chise on 04-Oct-18.
//

#ifndef CPP_LAB5_X_H
#define CPP_LAB5_X_H


#include <string>

class X {
private:
    std::string x;
public:
    X(std::string x) {
        this->x = x;
    }
    std::string toString() {
        return x;
    }
};


#endif //CPP_LAB5_X_H
