#include <iostream>
#include <fstream>
#include <cstdlib>
#include <string>

using namespace std;

bool checkanagram(string s);

int main()
{
    ifstream fin;
    string s;
    int count;
    
    fin.open("Anagram.txt");
    if (fin.is_open()) {
        getline(fin, s);
        count = atoi(s.c_str());
    }

    for (int i = 0; i < count; i++) {
        getline(fin, s);
        if (checkanagram(s)) cout << "true";
        else cout << "false";
        cout << endl;
    }

    fin.close();
    
    return 0;
}

/* Check if a string is an anagram. Print "true" if so or "false" otherwise.
 * @params:
 *      String s: String to test.
 */
bool checkanagram(string s)
{
    bool oddtaken = false;

    while (s.length() > 0) {
        size_t pos = s.find_last_of(s[0]);
        if (pos == 0) {
            if (!oddtaken) {
                oddtaken = true;
                s.erase(0, 1);
                continue;
            } else {
                return false;
            }
        }
        s.erase(pos, 1);
        s.erase(0, 1);
    }

    return true;
};
