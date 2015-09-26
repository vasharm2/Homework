"""
************************************************
  ____ ____    _  ___   __
 / ___/ ___|  / |/ _ \ / /_
| |   \___ \  | | (_) | '_ \
| |___ ___) | | |\__, | (_) |
 \____|____/  |_|  /_/ \___/

Problem Set 3
Problem 3

Find the python bug!
Should print:
'C S 1 9 6'
'C S 1 9 6'
'C S 1 9 6'
when correct
************************************************
"""

def printStatement(times, foo):
    length = len(foo);
<<<<<<< HEAD
    output = "'"
    for ii in range(0, length):
    	output += foo[ii]
    	if ii < length-1:
    		output += ' '
    output += "'"
    i = 0
    while i < times:
    	print(output)
    	i += 1
=======
    i = 0
    while i < times:
        j = 0
        print("'", end="")
        while j < length:
            print(foo[j], end=" ")
            j = j + 1
        print("\b'"),
        i += 1
>>>>>>> a7bb04f9623d9560ffd828c9847973fbac1570ee

printStatement(3, ['C','S','1','9','6'])
