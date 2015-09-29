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

//YOU CAN ONLY CHANGE THIS FUNCTION
void setString(string &address2, string &address3) {
	address2 = address3;
	return;
}

int main() {
	string address1("This is the ");
	string address2("incorrect output :(");
	string address3("correct output!");
	string *pointer1 = &address1;
	string *pointer2 = &address2;
	string *pointer3 = &address3;
	setString(address2, address3);
	cout << address1 + address2 << endl;

	return 0;
}
