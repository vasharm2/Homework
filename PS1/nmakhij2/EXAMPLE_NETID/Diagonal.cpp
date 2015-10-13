
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <fstream>
#include <algorithm>
#include <string>
#include <sstream>
using namespace std;


int main() {
    ifstream myfile("Diagonal.txt");
    string input;
    if(myfile.is_open()) {
        getline(myfile, input);
        int cases = stoi( input );
        for(int i = 0; i < cases; i++) {
            getline(myfile, input);
            int dimension = stoi( input );
            int matrix[dimension][dimension];
            for(int j = 0; j < dimension; j++) {
                string line;
                line = getline(myfile, line);
                istringstream iss(line);
                for(int k = 0; k < dimension; k++) {
                    string temp;
                    iss >> temp;
                    matrix[j][k] = stoi(temp);
                }
            }
            
            
            int output;
            /*
             Given the square matrix, store the product in the output
             variable above, and print it to console out.
             YOUR CODE HERE
             */
            int num;
            int array[100][100];
            std::cout<<"Enter size of the array";
            std::cin>>num;
            int leftDiagSum=0;
            int rightDiagSum =0;
            
            for( int i = 0; i< num; i++){
                for (int j = 0; j< num; j++){
                    if ( i == j){
                        leftDiagSum = leftDiagSum + array[i][i];
                    }
                }
                
                for (int i = 0 ; i< num; i++){
                    for (int j = 0; j< num; j++){
                        if ( (i+j) == (num -1)){
                            rightDiagSum = rightDiagSum + array[i][j];
                        }
                    }
                }
            }
            output =leftDiagSum * rightDiagSum;
            return (output);
            

        }
        myfile.close();
    }
    else cout << "unable to open file" << endl;
    
    return 0;
}