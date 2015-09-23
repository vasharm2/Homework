<<<<<<< HEAD
=======
from __future__ import print_function

>>>>>>> a8f2a634af4002ee8090e4aeab5e791433b1527a
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
        while j < length:
<<<<<<< HEAD
            print(foo[j]),
=======
            print(foo[j], end=' ')
>>>>>>> a8f2a634af4002ee8090e4aeab5e791433b1527a
            j = j + 1
        print('')
        i = i + 1

printStatement(3, ['C','S','1','9','6'])
