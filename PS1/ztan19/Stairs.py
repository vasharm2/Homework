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
# Author Zhiheng Tan, ztan19
# 9/4/2015

def stairs(input):
    space_index = int(input)
    hashtag_counter = 1
    while space_index > -1:
        if space_index is not 0:
            print (' ' * space_index), ('#' * hashtag_counter)
        space_index -=1
        hashtag_counter +=1
    pass;

try:
    with open('Stairs.txt', 'r') as f:
        stair_nums = f.read().split()
        for stair_num in stair_nums[1:]:
            stairs(stair_num)
except IOError, e:
    print e
