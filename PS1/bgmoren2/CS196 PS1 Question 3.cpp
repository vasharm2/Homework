//CS196 PS1 Question 3
//AUTHOR: bgmoren2
#include "stdafx.h"
#include <iostream>
#include <fstream>
#include <string>

using namespace std;

int main()
{
	ifstream inf("Stairs.txt");
	if (!inf)
	{
		cerr << "ERROR - Stairs.txt could not be read" << endl;
		return -1;
	}

	int nCases;
	inf >> nCases;

	//DEBUG
	//cout << "Total number of cases: " << nCases << endl;

	for (int c = 0; c < nCases; c++)
	{
		int nInput;
		inf >> nInput;
		int nRowCount = 1;

		for (int i = 0; i < nInput; i++)
		{
			//use align right manipulator with the shrinking field width to achieve a reverse staircase effect
			cout.width(nInput-i);
			cout << right;
			for (int j = 0; j < nRowCount; j++)
			{
				cout << "#";
			}
			nRowCount++;
			cout << " " << '\n';
		}

		cout << '\n' << endl;
	}

	cin.clear();
	cin.ignore(255, '\n');
	cin.get();

	return 0;
}