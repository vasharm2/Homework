#include <iostream>
#include <stdio.h>
#include <math.h>

using namespace std;

int main() {
    for (int i = 0; i < 3; i++) {
        for (int j = 3; j > 0; j--) {
            cout << pow(i, j) << endl;
        }
    }
}