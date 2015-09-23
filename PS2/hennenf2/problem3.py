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
    """My linter *really* hates this code :P. Then again, PEP8 is stupid.
        Who blacklists 'foo' as a variable name?"""
    length = len(foo)
    i = 0
    while i < times:
        j = 0
        for j in range(length):
            print(foo[j]),
        print ''
        i = i + 1

printStatement(3, ['C', 'S', '1', '9', '6'])
