#include <iostream>
#include <string>

using namespace std;



int main() {
	//variable declarations
	string *str1, temp, *str2, *temp2, str3, str6;
	*str1 = "This is the first part, ";
	temp = "this is the second part, ";
	*str2 = temp;
	*temp2 = "and this is the third part";
	str3 = *temp2;
	str6 = *str1 + *str2 + str3;
	if(str6.compare("This is the first part, this is the second part, and this is the third part") == 0) {
	    cout << str6 << endl << "this is the correct output!";
	}
	else {
	    cout << "this is the incorrect output :(" ;
	}

	return 0;
}


