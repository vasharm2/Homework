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


	swap(address2, address3);
	 pointer3 = pointer2; 
	 //Both are now pointing to the memory address of address2, which is the location of the correct string. 
	 string tempAddress(address2);
	 //I created a seperate variable so that I can hold a copy of the correct value in memory. 
	*pointer2 = address3; 
	/*This sets the value in the memory address of pointer2 (which is also the memory address of pointer3) to the incorrect value. 
	This makes both address2 and address3 both have incorrect output, and we lose the correct output string that we wanted (at least in its original form.)*/
	*pointer2 = tempAddress;
	//Here I reassign the pointer to the location of variable that we set earlier that contains the correct value. 

	cout << *pointer1 + *pointer2 << endl;

	return 0;
}
