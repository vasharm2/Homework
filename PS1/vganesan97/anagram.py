def anagram(word):
        list={}
        if len(word)==1:
            return true;
        if len(word)>1:
            x=len(word)
            if x%2==0:
                for i in word:
                    list[i]=list[i]+1;
                    if list[i]==1:
                        return false;
            if x%2==1:
                for j in word:
                    y=0
                    if list[i]%2==0:
                        y=y+1
                    if y>0:
                        return false;
                    if y>1:
                        return true;
        return False

try:
    with open('Anagram.txt', 'r') as f:
        words = f.read().split()
        for word in words[1:]:
            print anagram(word)
except IOError, e:
    print e








