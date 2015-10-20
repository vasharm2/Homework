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
	//variable declarations
	
	//cannot declare pointer at initialization
	string str1 = "This is the first part, ";
	
	string temp = "this is the second part, ";
	
	//pointer must equal the address of the variable
	string *str2 = &temp;	
	
	//cannot declare pointer at initialization
	string temp2 = "and this is the third part";
	
	//pointer must equal the address of the variable
	string *str3 = &temp2;

	//str2 and str3 are now pointers
	string str6 = str1 + *str2 + *str3;
	if(str6.compare("This is the first part, this is the second part, and this is the third part") == 0) cout << str6 << endl << "this is the correct output!" << endl;
	else cout << "this is the incorrect output :(" << endl;

	return 0;
}