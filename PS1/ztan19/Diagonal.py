'''
************************************************
  ____ ____    _  ___   __
 / ___/ ___|  / |/ _ \ / /_
| |   \___ \  | | (_) | '_ \
| |___ ___) | | |\__, | (_) |
 \____|____/  |_|  /_/ \___/


Problem set 1


Question 2

Given a square matrix size N x N, calculate the product of the sums across the two main diagonals.
For example, given the input:

3

4   5   7
3   1   5
9   3   2

Return: (4+1+2)*(9+1+7) = 119

PLEASE LOOK AT PS1.txt FOR MORE DETAILS!!!

************************************************
'''
# Author Zhiheng Tan, ztan19
# 9/4/2015

def diagonal(input):
    index = 0
    index_end = len(input) -1
    sumFrom_topLeft_to_bottomRight = 0
    sumFrom_topRight_to_bottomLeft = 0
    for list in input:
        # print list
        numFrom_topLeft_to_bottomRight = 0
        numFrom_topRight_to_bottomLeft = 0
        numFrom_topLeft_to_bottomRight += int(list[index])
        numFrom_topRight_to_bottomLeft += int(list[index_end])
        index +=1
        index_end -=1
        sumFrom_topLeft_to_bottomRight += numFrom_topLeft_to_bottomRight
        sumFrom_topRight_to_bottomLeft += numFrom_topRight_to_bottomLeft
    # print sumFrom_topLeft_to_bottomRight
    # print sumFrom_topRight_to_bottomLeft
    return sumFrom_topLeft_to_bottomRight * sumFrom_topRight_to_bottomLeft

try:
    with open('Diagonal.txt') as f:
        data = f.read().split()
        num_of_tests = data[0]
        data = data[1:]

        for i in range(0, int(num_of_tests)):
            matrix = []
            dimen = int(data[0])
            data = data[1:]

            for j in range(0, dimen):
                row = data[:dimen]
                matrix.append(row)
                data = data[dimen:]
            print diagonal(matrix)
except IOError, e:
    print e
