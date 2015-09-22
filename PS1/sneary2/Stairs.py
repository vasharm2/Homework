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
    res = []
    global count
    count = 0
    global step
    step = 1
    def white():
        global count
        global step
        while (count+step)<input:
            res.append(" ")
            count+=1
    def steps():
        global count
        global step
        while count<input:

            res.append("#")
            count+=1
        res.append("\n")
        step+=1
    while step <= int(input):
        white()
        steps()
        count=0
    res.pop()
    return "".join(res)

file = open('Stairs.txt', 'r')

text = file.read().split()

for x in text:
    print(stairs(int(x)))

"""
try:
    with open('Stairs.txt', 'r') as f:
        stair_nums = f.read().split()
        print(stairs_nums)
        for stair_num in stair_nums[1:]:
            stairs(stair_num)
except (IOError) as e:
    print (e)
    """