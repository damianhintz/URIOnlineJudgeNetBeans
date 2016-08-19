/* 
 * File:   main.cpp
 * Author: DHintz
 * Level:  1
 * Created on 19 sierpnia 2016, 12:21
 */

#include <cstdlib>
#include <iostream>

using namespace std;

int password(int numberOnPaper) {
    return --numberOnPaper;
}

int main(int argc, char** argv) {
    int n;
    while (cin >> n) {
        cout << password(n) << endl;
    }
    return 0;
}
