#include <iostream>
#ifndef PROBLEM3HELP_H
#define PROBLEM3HELP_H
#include "problem3help.h"

class problem3question {
public:
	void printQuestion3();
};


void problem3question::printQuestion3() {
	problem3help a;
	std::cout << a.printQuestion() << std::endl;
}

#endif
