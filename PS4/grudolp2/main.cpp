//main function.

#include "problem1.cpp"
#include "problem2.cpp"
#include "problem3question.h"

int main() {

	//function calls from the other problem files! you should not need to modify this
	problem1 a;
	problem2 b;
	problem3question c;
	problem3answer d;
	a.printQuestion1();
	a.printAnswer1();
	b.printQuestion2();
	b.printAnswer2();
	c.printQuestion3();
	d.printAnswer3();
	return 0;
}