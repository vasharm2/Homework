#include <iostream>
#include <string>

using namespace std;


/*
*
<<<<<<< HEAD
*  ____ ____    _  ___   __
* / ___/ ___|  / |/ _ \ / /_
*| |   \___ \  | | (_) | '_ \
*| |___ ___) | | |\__, | (_) |
* \____|____/  |_|  /_/ \___/
=======
*  ____ ____    _  ___   __   
* / ___/ ___|  / |/ _ \ / /_  
*| |   \___ \  | | (_) | '_ \ 
*| |___ ___) | | |\__, | (_) |
* \____|____/  |_|  /_/ \___/ 
>>>>>>> 2a85dd17495d4178e7126fd158f89c3638ce55c1
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
<<<<<<< HEAD
*/


int main() {
	string str1 = "This is the first part, ";
	string temp = "this is the second part, ";
	string *str2 = &temp;
	string temp2 = "and this is the third part";
	string str3 = temp2; //it should be  *temp2


// both sides have to have the same type
=======
*/	


int main() {
	variable declarations
	string *str1 = "This is the first part, ";
	string temp = "this is the second part, ";
	string *str2 = temp;
	string *temp2 = "and this is the third part";
	string str3 = temp2;


>>>>>>> 2a85dd17495d4178e7126fd158f89c3638ce55c1







<<<<<<< HEAD
// just add stars to st
	string str6 = str1 + *str2 + str3;
=======


	string str6 = str1 + str2 + str3;
>>>>>>> 2a85dd17495d4178e7126fd158f89c3638ce55c1
	if(str6.compare("This is the first part, this is the second part, and this is the third part") == 0) cout << str6 << endl << "this is the correct output!" << endl;
	else cout << "this is the incorrect output :(" << endl;

	return 0;
}
