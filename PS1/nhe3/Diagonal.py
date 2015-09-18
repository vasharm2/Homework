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
print (int('4'))
def diagonal(input):
    # YOUR CODE HERE
    diagList1 = []
    diagList2 = []
    for i in range(len(input)):
        diagList1.append(int(input[i][i]))
        diagList2.append(int(input[i][len(input)-i-1]))
    print (diagList1)
    print (diagList2)
    return sum(diagList1) * sum(diagList2)

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
            print (diagonal(matrix))
except IOError(e):
    print (e)

diagonal([[1,2],[3,4]])
