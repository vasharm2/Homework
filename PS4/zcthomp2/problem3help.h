#include <string>
#ifndef PROBLEM3HELP.H
#define PROBLEM3HELP.H


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

#endif // PROBLEM3HELP
