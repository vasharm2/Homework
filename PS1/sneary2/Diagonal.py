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

def diagonal(matrix):
    sum1=0
    sum2=0
    count1=0
    count2=len(matrix)-1
    for i in range(0,len(matrix)):
        sum1= sum1 + int(matrix[i][count1])
        sum2= sum2 + int(matrix[i][count2])
        count1+=1
        count2-=1

    res = sum1*sum2
    return res



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
            print(diagonal(matrix))
except IOError:
    print("IOError")