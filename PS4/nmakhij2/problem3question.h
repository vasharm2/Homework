#include <iostream>
#include "problem3help.h"
#include "problem3question.h"
class problem3question {
public:
	void printQuestion3();
};


void problem3question::printQuestion3() {
	problem3help a;
	std::cout << a.printQuestion() << std::endl;
}