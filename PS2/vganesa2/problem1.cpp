#include <iostream>

using namespace std;

void printSecondary() {
    cout << "... but maybe I will make a better one one day?";
}

int main() {
    for (int i = 0; i < 10; i++) {
        cout << "I wish I had " << i << " startups.";

        if (i == 3) {
            cout << "I hate my startup.";
            printSecondary ();
        }
    }
}