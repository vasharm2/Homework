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
        s = "'"
        while j < length:
            s = s + foo[j]
            j = j + 1
            if j != (length - 1):
                s = s + " ";
        print(s + "'")
        i = i + 1

printStatement(3, ['C','S','1','9','6'])