#include <iostream>
#include <string>
using namespace std;
/*
* Devise an addition to the existing code to fix the problem
* Correct output" "This is the correct output!"
*/	
int main() {
	//variable declarations
	string address1("This is the ");
	string address2("incorrect output :(");
	string address3("correct output!");
	string *pointer1 = &address1;
	string *pointer2 = &address2;
	string *pointer3 = &address3;
	/*
	* There is an issue in the code below.
	* Identify the reasons why the code below is printing the wrong output
	* Devise an addition to the existing code to fix the problem
	* (no deleting any of the current code!)
	* DO NOT SIMPLY ASSIGN ADDRESS1 AND ADDRESS2 TO THE CORRECT VALUES
	* you want to make setString do what it is intended to do.
	*/
	swap(address2, address3);

	pointer2 = &address2;
	cout << *pointer1 + *pointer2 << endl;
	return 0;
}