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
* (no deleting any of the current code!)
* Correct Output: "This is the correct output!"
* DO NOT SIMPLY ASSIGN ADDRESS1 AND ADDRESS2 TO THE CORRECT VALUES
* you want to make setString do what it is intended to do.
* reference http://www.cplusplus.com/doc/tutorial/pointers/ for additional information on pointers!
*/	

//YOU CAN ONLY CHANGE THIS FUNCTION
void setString(string& param2, string& param3) {
    param2 = param3;
	return;
}

/* Analysis :
 * The only things added here are the ampersands before the arguments of setString.
 * Also, for clarity, I changed the parameter names from "address2, address3", to "param2, param3"
 * The original code does not work because, for instance, if I call setString("foo","bar"),
 * the arguments of setString are "foo" and "bar", NOT THE VARIABLES CONTAINING THEM.
 * Thus setString(address2, address3), will copy the VALUE of address2 into param2, and address3 into param3.
 * Since param2 and param3 are distinct from address2 and address3, the statement doesn't affect
 * the value of address2.
 * However, with ampersands, the arguments of setString are the VARIABLES, address2 and address3 themselves.
 * Thus, when the line param2 = param3 is run, since param2 refers to address2 and param3 refers to address3, the value of address2 changes.
*/

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
