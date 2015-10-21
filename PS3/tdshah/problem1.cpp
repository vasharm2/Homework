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
	/*std::string str1;
    std::string str2;
    std::string str3;
    std::string str6;*/
    
	string tempZero= "This is the first part, ";
    string *str1 = &tempZero;
	string temp = "this is the second part, ";
	string *str2 = &temp;
    //str2 = this is the second part
    string tempTwo= "and this is the third part";
    string *str3 =&tempTwo;
	
	



	string str6 = *str1 + *str2 + *str3;
	if(str6.compare("This is the first part, this is the second part, and this is the third part") == 0) cout << str6 << endl << "this is the correct output!" << endl;
	else cout << "this is the incorrect output :(" << endl;

	return 0;
}
