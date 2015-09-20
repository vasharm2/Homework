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

#Was coded in Python 3.4.1: the "except" portion needed
#to be changed or else errors were thrown.

#Added global variable to allign stairs
spacing = 0

#Function to find spacing variable
def highest(value):
    global spacing
    if int(value) > spacing:
        spacing = int(value)

#Making stairs
def stairs(height):
    number = int(height)
    for x in range(1, (number + 1)):
        print((" " * (spacing - x)) + ("*" * x))
    print('')

try:
    with open('Stairs.txt', 'r') as f:
        stair_nums = f.read().split()
        for stair_num in stair_nums[1:]:    
            highest(stair_num)              #finding spacing variable
        for stair_num in stair_nums[1:]:
            stairs(stair_num)

except IOError:
    print("IOError")
