//
//  problem2.cpp
//  PS2problem1
//
//  Created by Angela Chang on 9/21/15.
//  Copyright © 2015 Angela Chang. All rights reserved.
//


#include <iostream>
#include <math.h>

using namespace std;

int main() {
    for (double i = 0.0; i < 3.0; i++) {
        for (double j = 3.0; j < 0.0; j--) {
            cout << pow(i, j) << endl;
        }
    }
}