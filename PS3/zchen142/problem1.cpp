
#include <iostream>

using namespace std;

int main() {

    string str1 = "This is the first part, ";
    string temp = "this is the second part, ";
    string str2 = temp;
    string temp2 = "and this is the third part";
    string str3 = temp2;    
    string str6 = str1 + str2 + str3;
    if(str6.compare("This is the first part, this is the second part, and this is the third part") == 0) cout << str6 << endl << "this is the correct output!" << endl;
    else cout << "this is the incorrect output :(" << endl;
    
    return 0;
}