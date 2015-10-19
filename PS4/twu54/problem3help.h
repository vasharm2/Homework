
#include <string>
#ifndef p3h
#define p3h


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
#endif // p3h
