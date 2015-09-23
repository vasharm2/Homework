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
    i = 0
    s = ""
    while i < times:
        for j in foo:
            s = s + j + " "
        print s
        s = ""
        i = i + 1

printStatement(3, ["C","S","1","9","6"])
