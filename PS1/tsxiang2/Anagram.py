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

#Was coded in Python 3.4.1: the "except" portion needed
#to be changed or else errors were thrown.

def anagram(word):
    letters = {}
    read = []

    #Occurance of each letter in word
    for letter in word:
        found = False
        for character in read:
            if letter == character:
                letters[letter] += 1
                found = True
        if found == False:
            letters[letter] = 1
            read.append(letter)

    #If more than two letter occurances are odd,
    #word is not an annagram of a palindrome.
    count = 0
    for letter in letters:
        if letters[letter] % 2 == 1:
            count += 1
    final = True
    if count >= 2:
        final = False
    return final

try:
    with open('Anagram.txt', 'r') as f:
        words = f.read().split()
        for word in words[1:]:
            print(anagram(word))
            
except IOError:
    print("IOError")
