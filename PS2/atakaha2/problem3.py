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
    length = len(foo);
    i = 1
    while i < times:
        j = 0
        while j <= length:
            print(foo[j]),
        j = j + 1
        print('')
    i = i + 1

=======
    length = len(foo)
    i = 0
    j = 1
    while i < times:
     print('\''),
     while j <= length:
       print(foo[j-1]),
       print(''),
       j = j + 1
     print('\'')
     i = i + 1
     j = 1
>>>>>>> a7bb04f9623d9560ffd828c9847973fbac1570ee
printStatement(3, ['C','S','1','9','6'])
