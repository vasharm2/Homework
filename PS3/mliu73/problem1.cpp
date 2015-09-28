#include <iostream>
#include <string>

using namespace std;


/*
 *
 *  ____ ____    _  ___   __
 * / ___/ ___|  / |/ _ \ / /_
 *| |   \___ \  | | (_) | '_ \
 *| |___ ___) | | |\__, | (_) |
 * \____|____/  |_|  /_/ \___/
 *
 *
 *
 * There are issues in this code
 * Identify the reasons why the code below is printing the wrong output
 * Fix the code to print the correct output!
 * correct output:"This is the first part, this is the second part, and this is the third part"
 *		 "this is the correct output!"
 * Do not simply reassign variables and delete the lines of code!!!
 * reference http://www.cplusplus.com/doc/tutorial/pointers/ for additional information on pointers!
 */


int main()
{
    //variables declarations;
    string str1 = "This is the first part, ";//pointer points to a variable, a pointer contains an address
    string temp = "this is the second part, ";
    string *str2 = &temp;
    string temp2 = "and this is the third part";
    string str3 = temp2;
    string str21= *str2;
    string str6 = str1 + str21 + str3;
    if(str6.compare("This is the first part, this is the second part, and this is the third part") == 0) cout << str6 << endl << "this is the correct output!" << endl;
    else cout << "this is the incorrect output :(" << endl;
    
    return 0;
}