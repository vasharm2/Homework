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

printStatement(3, ['C','S','1','9','6'])
