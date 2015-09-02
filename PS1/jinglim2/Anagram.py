from collections import defaultdict
def is_ana_palin(word):
    chars = list(word)
    counter = defaultdict(int)
    for letter in chars:
        counter[letter]+=1
    # print("".join(str(counter).split(',')[1:])[:-1])
    odd = 0
    for letter in counter:
        if counter[letter]%2==1:
            odd+=1
            if odd>=2:
                return False
    return True

with open('Anagram.txt', 'r') as f:
    data = f.readlines()

nCases = int(data[0])
todo=[i.strip() for i in data[1:1+nCases]]

for word in todo:
    print(str(is_ana_palin(word)).lower())