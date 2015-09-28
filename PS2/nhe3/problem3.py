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
    i = 0
    space = " "
    while i < times:
        j = 0
        printedString = ""
        while j < length:
            printedString = printedString + space + foo[j]
                # print(foo[j])
	        # print(' ')
            j = j + 1
        print(printedString)
        i = i + 1
    #print(space)

printStatement(3, ['C','S','1','9','6'])
