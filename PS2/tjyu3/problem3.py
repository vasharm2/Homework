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
            print(foo[j]),
            j = j + 1
        print('')
        i = i + 1
<<<<<<< HEAD

=======
>>>>>>> 5edd6c7553a89f2596f5e3746d02fce50a855597
printStatement(3, ['C','S','1','9','6'])
