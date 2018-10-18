#include <iostream>
#include "MyStack.h"
#include "BracketsChecker.h"
#include <fstream>
using namespace std;
int main() {
    ifstream in("../file.txt");

    if(!in) {
        cout << "Cannot open input file.\n";
        return 1;
    }

    char str[255];

    while(in) {
        in.getline(str, 255);  // delim defaults to '\n'
        if(in){
            BracketsChecker bc(str);
            cout << bc.checkBrackets() << ": " << str << endl;
        }

    }

    in.close();
    return 0;
}