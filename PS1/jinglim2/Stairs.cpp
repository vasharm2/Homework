#include <iostream>
#include <fstream>

int draw(int);

int main(int argc, char** argv){
    std::string current;
    int nCases;
    std::ifstream data ("Stairs.txt", std::ifstream::in);
    data>>nCases;
    for(int cases=0; cases<nCases; cases++){
        int levels;
        data>>levels;
        draw(levels);
    }

    return 0;
}

int draw(int levels){
    for (int i=0; i<levels; i++){
        for (int j=0; j<levels-i-1; j++){
            std::cout<<" ";
        }
        for (int k=0; k<=i; k++){
            std::cout<<"#";
        }
        std::cout<<std::endl;
    }


    return levels;
}
