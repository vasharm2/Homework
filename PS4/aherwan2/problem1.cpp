#include <iostream>
class problem1 {
public:
	void printQuestion1();
	void printAnswer1();
};


void problem1::printQuestion1() {
	std::cout << "This is the question for problem 1" << std::endl;
	return;
}

void problem1::printAnswer1() {
	std::cout << "This is the answer for problem 1!" << std::endl;
}