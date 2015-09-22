// CS196 PS1 Question 1 
//AUTHOR: bgmoren2
#include "stdafx.h"
#include <iostream>
#include <fstream>
#include <string>
#include <locale>

using namespace std;

//program will need to find if characters occur an even number of times while the char in the middle of the string
//may be odd

//moves through the selected array searching for a match of the value of at strInput[i], if it is found then true else false
bool isPreviousChar(string strInput, int i, char* chPrevious, int nLength)
{
	for (int j = 0; j < nLength; j++)
	{
		if (strInput[i] == chPrevious[j])
		{
			return true;
		}
	}
	return false;
}

int PreviousCharIndex(string strInput, int i, char* chPrevious, int nLength)
{
	for (int j = 0; j < nLength; j++)
	{
		if (strInput[i] == chPrevious[j])
		{
			return j;
		}
	}
}

class UniqueChars
{
private:
	//count of each character array should have its index in sync with the unique char array (index of nCount and chPrevious should be same)
	int* m_nCount;
	int m_nIndex;
public:
	UniqueChars(int nIndex = 0)
		: m_nIndex(nIndex)
	{
		if (m_nIndex == 0)
		{
			cerr << "ERROR - no unique characters detected" << endl;
		}
		else
		{
			m_nCount = new int[m_nIndex];
			for (int i = 0; i < m_nIndex; i++)
			{
				m_nCount[i] = 0;
			}
		}
	}

	void IncrementCharCount(int nIndex)
	{
		if (nIndex > m_nIndex)
		{
			cerr << "ERROR - IncrementCharCount index is too large" << endl;
		}
		m_nCount[nIndex] += 1;
	}

	int GetCharCount(int nIndex)
	{
		return m_nCount[nIndex];
	}

	int GetUniqueCharCount()
	{
		return m_nIndex;
	}

	int* GetnCount()
	{
		return m_nCount;
	}

	void DEBUG_PrintArray()
	{
		for (int i = 0; i < m_nIndex; i++)
		{
			cout << "Counts are: " << m_nCount[i] << endl;
		}
	}

	~UniqueChars()
	{
		delete[] m_nCount;
	}
};

bool isPalindrome(int nLength, char* chPrevious, UniqueChars &cChars)
{
	int nExtraCharCount = 0;
	int* nCount = cChars.GetnCount();
	int nUniqueCharCount = cChars.GetUniqueCharCount();

	//if there is a odd number of characters then the middle char can occur an odd number of times
	if (nLength % 2)
	{
		for (int i = 0; i < nUniqueCharCount; i++)
		{
			if (nCount[i] % 2 == 1)
			{
				nExtraCharCount++;
			}
		}
		if (nExtraCharCount > 1)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	//if even number of characters then there should be even numbers of every character
	else if (!(nLength % 2))
	{
		for (int i = 0; i < nUniqueCharCount; i++)
		{
			if (nCount[i] % 2 == 1)
			{
				nExtraCharCount++;
			}
		}
		if (nExtraCharCount > 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	else
	{
		return false;
	}
}

int main()
{

	//read in Anagram.txt file to work with
	ifstream inf("Anagram.txt");

	//if can't open anagram.txt exit program with error
	if (!inf)
	{
		cerr << "ERROR - Cannot open the file Anagram.txt";
		return -1;
	}

	//read in the number of cases for the loop to determine how many times to run
	int nNumberOfCases = 0;
	inf >> nNumberOfCases;

	//DEBUG
	//cout << "Number of sets of strings: " << nNumberOfCases << endl;

	//run loop to go through and test each line in the file
	for (int b = 0; b < nNumberOfCases; b++)
	{
		//get line to be tested
		string strInput;
		inf >> strInput;

		//DEBUG
		cout << "Current string: " << strInput << endl;

		int nLength = strInput.length();
		int nUniqueCount = 0;

		//cast to lower case to deal with mixed case strings
		locale cLoc;
		for (string::size_type z = 0; z < nLength; z++)
		{
			strInput[z] = tolower(strInput[z], cLoc);
		}

		//store the type of char that was already compared
		const int nAlphabetCount = 26;
		char chPrevious[nAlphabetCount] = { 0 };
		int nIndex = 0;

		for (int i = 0; i < nLength; i++)
		{
			//DEBUG
			//cout << "the current base character is: " << strInput[i] << endl;

			//assign the current char to chPrevious, if there are any more entries that for strInput[i] that match with this array then move on to next i			
			if (isPreviousChar(strInput, i, chPrevious, nAlphabetCount))
			{
				//DEBUG
				//there is a duplicate of char strInput[i], need to get the char and increment the count for this char
				//cout << "^^ char has been previously used, moving on to the next char" << endl;

				continue;
			}

			chPrevious[nIndex] = strInput[i];
			nIndex++;
			nUniqueCount++;
		}

		UniqueChars cCharSet(nUniqueCount);

		//DEBUG
		//cout << "Unique characters: " << nUniqueCount << endl;
		int nDuplicateIndex;

		//reset the previous index counter
		nIndex = 0;

		//reset the previous chars
		for (int i = 0; i < nLength; i++)
		{
			//DEBUG
			//cout << chPrevious[i] << endl;
			chPrevious[i] = 0;
		}

		//loop through string again
		for (int i = 0; i < nLength; i++)
		{
			//DEBUG
			//cout << "the current base character is: " << strInput[i] << endl;

			//assign the current char to chPrevious, if there are any more entries that for strInput[i] that match with this array then move on to next i			
			if (isPreviousChar(strInput, i, chPrevious, nAlphabetCount))
			{
				//DEBUG
				//there is a duplicate of char strInput[i], need to get the char and increment the count for this char
				//cout << "^^ char has been previously used, incrementing counter" << endl;

				//need to set the proper index based on the index of the uniqueChar array 
				nDuplicateIndex = PreviousCharIndex(strInput, i, chPrevious, nLength);

				//DEBUG
				//cout << "the char " << strInput[i] << " at array index " << nDuplicateIndex << " is being incremented" << endl;

				cCharSet.IncrementCharCount(nDuplicateIndex);
				continue;
			}
			chPrevious[nIndex] = strInput[i];
			nDuplicateIndex = PreviousCharIndex(strInput, i, chPrevious, nLength);
			cCharSet.IncrementCharCount(nDuplicateIndex);
			nIndex++;
		}

		cout.setf(ios::boolalpha);

		//cCharSet.DEBUG_PrintArray();
		cout << isPalindrome(nLength, chPrevious, cCharSet) << endl;
	}

	cin.clear();
	cin.ignore(255, '/n');
	cin.get();

	return 0;
}