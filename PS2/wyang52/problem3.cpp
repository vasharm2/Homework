//
//  problem3.cpp
//  helo
//
//  Created by SamYang95 on 9/19/15.
//  Copyright © 2015 SamYang95. All rights reserved.
//

/*
************************************************
____ ____    _  ___   __
/ ___/ ___|  / |/ _ \ / /_
| |   \___ \  | | (_) | '_ \
| |___ ___) | | |\__, | (_) |
\____|____/  |_|  /_/ \___/

Problem Set 3
Problem 3

Find the python bug!
Should print:
'C S 1 9 6'
'C S 1 9 6'
'C S 1 9 6'
when correct
************************************************
*/
 

#include <array>
#include <iostream>

using namespace std;

void printStatement (int times, array<char,5> input){
        
    while (times > 0){
        for (int index = 0; index < input.size(); index++){
            
            if (index == input.size()-1){
                cout << input[index] << endl;
                
            }else{
            cout << input[index] << ' ';
                
            }
        }
        times--;
    }
}

int main (){
    array<char,5> arr= {'C','S','1','9','6'};
    printStatement (3, arr);
}