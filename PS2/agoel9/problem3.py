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
Should print 'CS196' when completed
************************************************
"""
import sys

def printStatement(foo):
    length = len(foo);
    string = ""
    for i in xrange(length):
        string += str(foo[i])
    print string

printStatement(['CS','1','9','6'])
