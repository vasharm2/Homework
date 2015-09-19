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
        dic = {}
        for i in word:
                if dic.has_key(i):
                        dic[i] = dic[i] + 1
                else:
                        dic[i] = 1
        totalOddCount = 0
        for key in dic:
                if dic[key] % 2  == 1:
                        totalOddCount = totalOddCount + 1
        if totalOddCount == 0 or totalOddCount == 1:
                return True;
        return False;

try:
        with open('Anagram.txt', 'r') as f:
                words = f.read().split()
        for word in words[1:]:
                print anagram(word)
except IOError, e:
        print e
