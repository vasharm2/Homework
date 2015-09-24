def stairs(n):
    s=int(n)
    for i in range(1,s):
        for j in range(1,s-1):
            for k in range(1,j)
                print(' '* '#')
    pass;
try:
    with open('Stairs.txt', 'r') as f:
        stair_nums = f.read().split()
        for stair_num in stair_nums[1:]:
            stairs(stair_num)
except IOError, e:
    print e