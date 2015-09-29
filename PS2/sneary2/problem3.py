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
#I probalble edited too much but print(0), was still printing a new line even with the comma.
def printStatement(times, foo):
    i = 1
    while i <= times:
        print(" ".join(foo))
        i = i + 1

printStatement(3, ['C','S','1','9','6'])
