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
* There is an issue in this code
* Identify the reasons why the code below is printing the wrong output
* Devise an addition to the existing code to fix the problem
* Correct output" "This is the correct output!"
* (no deleting any of the current code!)
* DO NOT SIMPLY ASSIGN POINTER1 AND POINTER2 TO THE CORRECT VALUES
* reference http://www.cplusplus.com/doc/tutorial/pointers/ for additional information on pointers!
*/


int main() {
	//variable declarations
	string address1("This is the ");
	string address2("incorrect output :(");
	string address3("correct output!");
	string *pointer1 = &address1;
	string *pointer2 = &address2;
	string *pointer3 = &address3;

	/*** BEGIN CHALLENGE (no modifications besides additions) ***/

	// address2 = "correct output!"
	// address3 = "incorrect output :("
	// pointers stay the same as they were
	swap(address2, address3);
	// pointer3 = *(&pointer2) and pointer2 = &address2
	// both pointers point to the address containing the correct value
	pointer3 = pointer2;

	// my addition -- see explanation as to why this helps below
	swap(address2, address3);

	// originally, this would set the value of the address pointed to by
	// pointer2 to whatever was in address3, which was a major problem...
	// both address2 and address3 wound up being "incorrect output :("
	//
	// now, however, we are causing both address2 and address3 to be "correct output"
	// which is great
	*pointer2 = address3;

	/*** END CHALLENGE ***/

	cout << *pointer1 + *pointer2 << endl;

	return 0;
}
