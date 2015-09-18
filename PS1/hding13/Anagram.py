'''
************************************************
  ____ ____    _  ___   __
 / ___/ ___|  / |/ _ \ / /_
| |   \___ \  | | (_) | '_ \
| |___ ___) | | |\__, | (_) |
 \____|____/  |_|  /_/ \___/


Problem set 1


Question 1

A common problem in computer science is finding patterns within data.
This problem will simulate that in a way that is easy to see what is happening.

A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
Allowances may be made for adjustments to capital letters, punctuation, and word dividers.

an anagram is a word, phrase, or name formed by rearranging the letters of another.


Given a String S, determine if it is an anagram of a palindrome.
Return true if the String is an anagram of a palindrome, and false otherwise.
For example, the String 'oatrtro' will return true (rotator), while the String 'false' will return false.

PLEASE LOOK AT PS1.txt FOR MORE DETAILS!!!

************************************************
'''

def anagram(word):
    # YOUR CODE HERE
    newWord = removeFirst(word, False)
    if newWord:
        return True 
    return False

def removeFirst(word, notFirst):
    index = None
    while len(word) > 1:
        index = findChars(word, notFirst)
        if index :
            word = delChar(word, index)
            word = delChar(word, 0)
        else:
            return None
    return " "
def findChars(word, notFirst):
    if not notFirst:
        for c in xrange(1, len(word)):
            if word[c] == word[0]:
                return c
        notFirst = True
    else:
        for c in xrange(2, len(word)):
            if word[c] == word[1]:
                return c
        return None
def delChar(word, index):
    part1 = word[:index]
    part2 = word[index+1:]
    return part1+part2
 
            
try:
    with open('Anagram.txt', 'r') as f:
        words = f.read().split()
        for word in words[1:]:
            print anagram(word)
except IOError, e:
    print e
