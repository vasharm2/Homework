'''
************************************************
  ____ ____    _  ___   __
 / ___/ ___|  / |/ _ \ / /_
| |   \___ \  | | (_) | '_ \
| |___ ___) | | |\__, | (_) |
 \____|____/  |_|  /_/ \___/


Problem set 1


Question 3

Given an integer input N, print a staircase out of height N. For example, given the input 4, print out the following staircase:

    #
   ##
  ###
 ####
#####


PLEASE LOOK AT PS1.txt FOR MORE DETAILS!!!

************************************************
'''

def stairs(input):
    
    for x in xrange(0, int(input)+2):
        currentString = ""
        for y in xrange(0, int(input)+2):
            
            if int(input)+2-y > x:
                currentString +=  " "
            else:
                currentString += "x"
        print currentString
    pass;

try:
    with open('Stairs.txt', 'r') as f:
        stair_nums = f.read().split()
        for stair_num in stair_nums[1:]:
            stairs(stair_num)
except IOError, e:
    print e
