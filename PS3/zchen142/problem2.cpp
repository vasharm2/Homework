//
//  p2.cpp
//  C
//
//  Created by Daniel Chen on 9/22/15.
//  Copyright (c) 2015 Daniel. All rights reserved.
//

#include <iostream>


using namespace std;

void setString(string &address2, string &address3) {
    address2 = address3;
    return;
}





int main() {
    //variable declarations
    string address1("This is the ");
    string address2("incorrect output :(");
    string address3("correct output!");
    string *pointer1 = &address1;
    string *pointer2 = &address2;
    string *pointer3 = &address3;
    setString(address2, address3); //See line 23
    cout << address1 + address2 << endl;
    
    return 0;
}