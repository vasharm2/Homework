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
*/	

#include <iostream>
#include <string>
using namespace std;
int main() 
{
	string* str1 =new string("This is the first part, ");
	string* temp =new string( "this is the second part, ");
	string *str2 = temp;
	string *temp2 = new string("and this is the third part");

	string str3 = *temp2;
	
	string str6 = *str1 + *str2 + str3;
	if(str6.compare("This is the first part, this is the second part, and this is the third part") == 0) cout << str6 << endl << "this is the correct output!" << endl;
	else cout << "this is the incorrect output :(" << endl;

	return 0;

}
