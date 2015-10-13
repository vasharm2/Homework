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

	/*
	*
	*
	* There is an issue in the code below.
	* Identify the reasons why the code below is printing the wrong output
	* Devise an addition to the existing code to fix the problem
	* (no deleting any of the current code!)
	* DO NOT SIMPLY ASSIGN ADDRESS1 AND ADDRESS2 TO THE CORRECT VALUES
	* you want to make setString do what it is intended to do.
	*/

	//cout << address2 + " " + address3 << endl;
	
	swap(address2, address3);
	
	//cout << address2 + " " + address3 << endl;
	
	// at this point address2 = "correct...", address3 = "incorrect..."
	// but the address of the pointers are unchanged, and we print from the pointers
	
	pointer3 = pointer2;
	//*pointer2 = address3;	// this actually changes the VALUE that pointer2 was pointing to, in this case address2, to "incorrect..." . This means that BOTH address2 and address3 = "incorrect..."
	pointer2 = &address3;

	//cout << address2 + " " + address3 << endl;
	
	// now we swapped the pointers, but ofcourse since we swapped the values we're back to where we started
	// so swap the values of the pointers (ie the addresses they point to) with each other (swapping the addresses would probably work too but seems to be against the point of the assignment?)
	
	swap(pointer2, pointer3);






	cout << *pointer1 + *pointer2 << endl;

	return 0;
}