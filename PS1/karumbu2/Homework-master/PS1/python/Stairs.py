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
    n=input
    l = int(n)
    n = int(n)
    m = 1
    while n != m - 2:
        print(" " * int(l) + "#"*int(m))
        m = int(m) + 1
        l = int(l) - 1
        pass;
    try:
        with open('Stairs.txt', 'r') as f:
            stair_nums = f.read().split()
            for stair_num in stair_nums[1:]:
                stairs(stair_num)
    except IOError as e:
        print(e)