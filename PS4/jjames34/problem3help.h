#ifndef PROBLEM3HELP_H_INCLUDED
#define PROBLEM3HELP_H_INCLUDED
#include <string>


class problem3help {
	public:
		std::string printQuestion();
		std::string printAnswer();
};

std::string problem3help::printQuestion() {
	return "This is the question for problem 3";
}

std::string problem3help::printAnswer() {
	return "This is the answer for problem 3!";
}
#endif