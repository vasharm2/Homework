#include <iostream>
#include <string>

using namespace std;


void swap (string &address2, string &address3){
    return;
}

int main() {
	//variable declarations
	string address1("This is the ");
	string address2("incorrect output :(");
	string address3("correct output!");
	string *pointer1 = &address1;
	string *pointer2 = &address2;
	string *pointer3 = &address3;

	swap(address2, address3);
	pointer3 = pointer2;
	*pointer2 = address3;

	cout << *pointer1 + *pointer2 << endl;
	return 0;
}
