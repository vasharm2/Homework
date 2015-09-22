def anagram(word):
    if(len(word)==1):
        return True
    chances = len(word) % 2
    res = True
    verif = list(word)
    verif.sort()
    while len(verif) > 0 :
        if len(verif) == 1:
            if chances == 1:
                return True
            else:
                return False
        elif(verif[0]==verif[1]):
            verif.remove(verif[1])
            verif.remove(verif[0])
        elif(chances>0):
            chances-=1
            verif.remove(verif[0])
        else:
            return False
    return True

#I have no idea what I id here but it works!
file = open('Anagram.txt', 'r')
test = (file.read()).split()

count = 0
while (count < len(test)):
    print(anagram(test[count]))
    count += 1