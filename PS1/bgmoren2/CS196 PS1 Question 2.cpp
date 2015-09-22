//CS196 PS1 Question 2
//AUTHOR: bgmoren2
#include "stdafx.h"
#include <iostream>
#include <fstream>
#include <string>

using namespace std;

int main()
{
	ifstream inf("Diagonal.txt");
	if (!inf)
	{
		cerr << "ERROR - Diagonal.txt could not be read" << endl;
		return -1;
	}

	int nCases = 0;
	int nArrayDimensions = 0;
	inf >> nCases;

	//DEBUG
	//cout << "Total number of cases: " << nCases << endl;

	for (int c = 0; c < nCases; c++)
	{
		//first thing that is read will be the dimensions of the array
		inf >> nArrayDimensions;
		cout << "Array size is: " << nArrayDimensions << endl;

		//need a dynamic 2D array for the given one 
		//allocated the rows
		int** ptrArray = new int*[nArrayDimensions];

		//allocate the columns
		for (int i = 0; i < nArrayDimensions; i++)
		{
			ptrArray[i] = new int[nArrayDimensions];
		}

		int nInput;
		int nDiag1 = 0;
		int nDiag2 = 0;

		//retrieves the array from the file and places it into dynamic 2D array and calculates the first diagonal
		cout << "(";
		for (int i = 0; i < nArrayDimensions; i++)
		{
			for (int j = 0; j < nArrayDimensions; j++)
			{
				inf >> nInput;
				ptrArray[i][j] = nInput;

				//performs addition inside of assignment for loop in order to save performance
				if (j == i)
				{
					nDiag1 += ptrArray[i][j];
					cout << ptrArray[i][j];
					if (j < nArrayDimensions - 1)
						cout << " + ";
					else
						cout << ")";
				}
			}
		}

		int nRows = -1;
		int nCols = 0;
		cout << " * ";

		//Diagonal 2 calculations below
		cout << "(";
		for (nCols = nArrayDimensions - 1; nCols > -1; nCols--)
		{
			nRows++;
			nDiag2 += ptrArray[nCols][nRows];
			cout << ptrArray[nCols][nRows];
			if (nCols > 0)
				cout << " + ";
			else
			{
				cout << ")";
			}
		}

		//DEBUG
		//cout << "Diagonal 1 sum is: " << nDiag1 << endl;
		//cout << "Diagonal 2 sum is: " << nDiag2 << endl;
		cout << " = " << nDiag1*nDiag2 << endl;
		cout << endl;
	}

	cin.clear();
	cin.ignore(255, '\n');
	cin.get();

	return 0;
}