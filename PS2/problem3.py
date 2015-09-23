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
<<<<<<< HEAD
    i=0
    while(i < times):
        j = 0
        while(j < len(foo)):
            print(foo[j]),
            j = j + 1
        print("\n"),
        i = i + 1
printStatement(3, ['C','S','1','9','6'])
=======
    length = len(foo);
<<<<<<< HEAD
    i = 0
    j = 2
    while i < times:
        while j < length:
            print(' '.join(foo))
            j = j + 1
        i = i + 1
=======
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
>>>>>>> f64eb7c78787c358fd6dd350c72b688fae38e5a8

printStatement(3, ['C','S','1','9','6'])
>>>>>>> 5edd6c7553a89f2596f5e3746d02fce50a855597
