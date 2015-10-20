#include <iostream>
#include "problem3help.h"

#ifndef PS4_PROBLEM3QUESTION_H
#define PS4_PROBLEM3QUESTION_H
class problem3question {
public:
	void printQuestion3();
};


void problem3question::printQuestion3() {
	problem3help a;
	std::cout << a.printQuestion() << std::endl;
}

#endif