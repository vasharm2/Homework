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
	// variable declarations
	string str1 = "This is the first part, ";
	string temp = "this is the second part, ";
	string *str2 = &temp;
	string temp2 = "and this is the third part";
	string str3 = temp2;

        /* Analysis : 
         * 
         * The variable type 'string' refers to an actual string, 
         * but the variable type 'string*' refers to a POINTER, a memory address, which refers to a string.
         * Thus attempting to force a string, say "This is the first part, " into a variable type 'string*' will produce errors.
         * 
         * 
         * Here are the old variable declarations : 
         * 
         * string *str1 = "This is the first part, ";
         * As aforementioned, we are declaring variable str1 of type string* here, and a string is unacceptable.
         * The * must be removed.
         * 
         * string temp = "this is the second part, ";
	 * string *str2 = temp;
         * As aforementioned, we are declaring variable str2 of type string* here, and a string is unacceptable.
         * We could remove the *, but if we wish to keep str2 a string*, we must add an ampersand before 'temp', in this way 
         * str2 is a pointer referring to the address of string temp. 
         * 
	 * string *temp2 = "and this is the third part";
	 * string str3 = temp2;
         * As aforementioned, we are declaring variable temp2 of type string* here, and a string is unacceptable.
         * The * must be removed, and str3 = temp2 will then work fine because both variables are strings also.
         * 
         * Of course, this means we must also modify the final statement by dereferencing the pointer str2.
        */

	string str6 = str1 + *str2 + str3;
	if(str6.compare("This is the first part, this is the second part, and this is the third part") == 0) cout << str6 << endl << "this is the correct output!" << endl;
	else cout << "this is the incorrect output :(" << endl;

	return 0;
}
