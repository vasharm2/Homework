#include <iostream>
#include <cstring>
#include <fstream>
#include <sstream>
#include <map>

std::string is_ana_palin(std::string);

template <typename K, typename V>
V Default0(const  std::map <K,V> & m, const K & key) {
   typename std::map<K,V>::const_iterator it = m.find( key );
   if ( it == m.end() ) {
      return 0;
   }
   else {
      return it->second;
   }
}

int main(int argc, char** argv) {
    std::string current;
    int nCases;
    std::ifstream data ("Anagram.txt", std::ifstream::in);
    if (data){
        if (std::getline(data,current)){
            std::stringstream cases(current);
            if (!(cases >> nCases)){
                nCases = 0;
            }
        }
        for (int i=0; i<nCases; i++){
            std::getline(data, current);
            std::cout<<is_ana_palin(current);
        }
    }
    data.close();
    return 0;
}

std::string is_ana_palin(std::string word){
    int len_arr = word.size(); //do not +1 to ignore the new line
    char *chars = new char[len_arr];
    chars[word.size()]=0;
    memcpy(chars,word.c_str(),word.size());

    std::map<char, int> counter;
    for(int i=0; i<len_arr; i++){
        counter[chars[i]]=Default0(counter,chars[i])+1;
//        std::cout<<counter[chars[i]]<<std::endl;
    }

    int odd=0;

    //loop through counter
    for (std::map<char, int>::iterator it = counter.begin();
    it != counter.end(); ++it){
        if(it->second % 2 ==1){
            odd++;
            if (odd>1){
                return "false\n";
            }
        }
    }
    return "true\n";
}
