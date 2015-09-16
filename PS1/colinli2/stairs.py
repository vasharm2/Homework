def stairs(input):
    for i in range(0,int(input)):
        for j in range(1,int(input)-i):
            print(" ",end="")
        for j in range(0,i+1):
            print("#",end="")

        print("")
    pass;

try:
    with open('Stairs.txt', 'r') as f:
        stair_nums = f.read().split()
        for stair_num in stair_nums[1:]:
            stairs(stair_num)
except (IOError) as e:
    print (e)
