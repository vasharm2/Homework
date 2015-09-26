
  Created by Daniel Chen on 9/22/15.
  Copyright (c) 2015 Daniel. All rights reserved.


#include <iostream>
#include <cmath>

using namespace std;

int main() {
    
    for (int i = 0; i < 3; i++) {
        for (int j = 3; j > 0; j--) {
            cout << pow(i, j) << endl;
        }
    }
    return 0;
}