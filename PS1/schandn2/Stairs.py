'''
************************************************
  ____ ____    _  ___   __
 / ___/ ___|  / |/ _ \ / /_
| |   \___ \  | | (_) | '_ \
| |___ ___) | | |\__, | (_) |
 \____|____/  |_|  /_/ \___/


Problem set 1


Question 3

Given an integer input N, print a staircase out of height N. For example, given the input 5, print out the following staircase:

    #
   ##
  ###
 ####
#####


PLEASE LOOK AT PS1.txt FOR MORE DETAILS!!!

************************************************
'''

def stairs(input):
    input = int(input)
    for i in range(1,input+1):
        spaces = " "*(input-i)
        string = "#"*i
        print  spaces+string
    pass;

try:
    with open('Stairs.txt', 'r') as f:
        stair_nums = f.read().split()
        for stair_num in stair_nums[1:]:
            stairs(stair_num)
except IOError, e:
    print e
