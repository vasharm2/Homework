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


int main() {
	/*** BEGIN CHALLENGE (modification permitted; no whole-line deletions) ***/
	// variable declarations

	// cannot assign string value to string pointer at initialization
	// instead, we make this a standard variable of type string
	string str1 = "This is the first part, ";
	// all is good here
	string temp = "this is the second part, ";
	// again, we cannot assign a string value to a string pointer here
	// instead, we provide the address of temp to dereference later
	string *str2 = &temp;
	// once again, cannot assign string values to a string pointer here
	// instead, we make this a standard variable like temp
	string temp2 = "and this is the third part";
	// then we make str3 a string pointer and assign it the address of temp2
	string *str3 = &temp2;

	// finally, we must dereference string pointers str2 and str3
	string str6 = str1 + *str2 + *str3;
	/*** END CHALLENGE ***/

	if(str6.compare("This is the first part, this is the second part, and this is the third part") == 0) cout << str6 << endl << "this is the correct output!" << endl;
	else cout << "this is the incorrect output :(" << endl;

	return 0;
}
