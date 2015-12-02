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

def diagonal(input):
    count = 0
    for i in range(0, len(input)):
        for j in range(0, len(input[i])):
            if (i == j):
                # print str(i) + ', ' + str(j)
                count += int(input[i][j])
    for i in range(0, len(input)):
        for j in range(0, len(input[i])):
            if (i == j):
                # print str(i) + ', ' + str(j)
                x = len(input) - 1 - i
                # y = len(input[x]) - 1 - j
                # print str(x) + ', ' + str(j)
                count += int(input[x][j])
    return count

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
            # print (matrix)
            print (diagonal(matrix))
except IOError, e:
    print e