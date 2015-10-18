//jamrozy2
#include <string>
#ifndef __PROBLEM3HELP_H_INCLUDED__
#define __PROBLEM3HELP_H_INCLUDED__


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