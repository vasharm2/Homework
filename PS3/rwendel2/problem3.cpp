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
	* DO NOT SIMPLY ASSIGN ADDRESS1 AND ADDRE;SS2 TO THE CORRECT VALUES
	* you want to make setString do what it is intended to do.
	*/


	swap(address2, address3);
            //now address3 = address2, and address2=address3
        
	
        pointer3 = pointer2;
        // *pointer2 = "correct output!"
        // *pointer3 = "correct output!"


        swap(address2, address3);
        //my addition
        //swaps the address back to their correct values. 
        //this means that address2 == "incorrect value"
        //address3 == "correct value"
        //that works perfectly -- because we assign the value of 
        //pointer2 back to address3
        
	*pointer2 = address3;
        //sets the value at pointer2 = address3 (correct output!);

	cout << *pointer1 + *pointer2 << endl;
	return 0;
}
