#include <iostream>
#include <fstream>
#include <sstream>
#include <vector>

int calc_diff(std::vector<std::vector<int> > main_arr, int thisSize);

int main(int argc, char** argv){
    std::string current;
    int nCases;
    std::ifstream data ("Diagonal.txt", std::ifstream::in);
    if (data){
        if (std::getline(data,current)){
            std::stringstream cases(current);
            if (!(cases >> nCases)){
                nCases = 0;
            }
        }
        //std::cout<<nCases;
        for (int i=0; i<nCases; i++){
            int thisSize;
            data>>thisSize;
            //std::cout<<thisSize<<std::endl;
            std::vector<std::vector<int> > main_arr(thisSize);
            for (int j=0; j<thisSize; j++){
                std::vector<int> currentrow(thisSize);
                for (int k=0; k<thisSize; k++){
                    data>>currentrow[k];
                }
                main_arr[j]=currentrow;
            }
            std::cout<<calc_diff(main_arr, thisSize)<<std::endl;
        }
    }
    data.close();


    return 0;
}

int calc_diff(std::vector<std::vector<int> > main_arr, int thisSize){
    int left_diag =0;
    int right_diag =0;
    for(int i=0; i<thisSize; i++){
        left_diag+=main_arr[i][i];
        right_diag+=main_arr[i][thisSize-i-1];
    }
    return left_diag*right_diag;
}
