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
    j=0
    k=0
    while i < times*4:
        print("")
        for j in range(length):
            print(foo[j]),

            # print''.join(foo)
            j = j + 1
            i = i + 1

printStatement(3, ['C','S','1','9','6'])
