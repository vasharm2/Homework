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


#include <iostream>
#include <string>
int main() {
	//variable declarations
	std::string str1 = "This is the first part, ";
	std::string temp = "this is the second part, ";
	std::string &str2 = temp;
	std::string temp2 = "and this is the third part";
	std::string &str3 = temp2;
	std::string str6 = str1 + str2 + str3;
	if (str6.compare("This is the first part, this is the second part, and this is the third part") == 0)
		std::cout << str6 << "\n" << "this is the correct output!" << "\n";
	else std::cout << "this is the incorrect output :(" << "\n";

	return 0;
}
