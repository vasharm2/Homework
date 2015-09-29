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
    while i < times:
        j = 0
        str = ""
        while j < length:
            if j == 0:
                print("'" + foo[j], end= " ")
            elif j == length - 1:
                print(foo[j] + "'",end= " ")
            else:
                print(foo[j], end=" ")
            j = j + 1
        print('')
        i = i + 1

printStatement(4, ['C','S','1','9','6'])
