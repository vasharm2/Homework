


def anagram(word):

    UnPaired = 0
    Finished = False
    while (UnPaired < 2 and word != ""):
        Found = word.count(word[UnPaired])
        #print("Found",Found)
        #print(word,word[UnPaired])
        word=word.replace(word[UnPaired],"")
        #print(word)
        UnPaired += Found%2 

    if UnPaired == 2:
        return False
    else:
        return True



    
    

try:
    with open('Anagram.txt', 'r') as f:
        words = f.read().split()
        for word in words[1:]:
            print(anagram(word))
except(IOError) as e:
    print(e)
