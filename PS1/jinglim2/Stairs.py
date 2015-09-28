import numpy as np

def construct_stairs(level):
    for i in range(1,level+2):
        print(" "*(level+1-i), end="")
        print("#"*i)

with open('Stairs.txt', 'r') as f:
    data = f.read().split()


nCases = int(data.pop(0))

while nCases>0:
    construct_stairs(int(data.pop(0)))
    nCases-=1