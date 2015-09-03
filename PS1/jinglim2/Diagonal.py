import numpy as np

def construct_matrix(values):
    dimen = int(values.pop(0))
    data = values[0:dimen]
    mat = []
    for row in data:
        mat.append([int(i) for i in row.split('\t')])
    for i in range(dimen):
        values.pop(0)
    matrix = np.reshape(np.array(mat), [dimen, dimen])
    return matrix, dimen

with open('Diagonal.txt', 'r') as f:
    data = f.read().split('\n')
data2=[]
for i in data:
    if i!='':
        data2.append(i)
# print(data2)
nCases = int(data2.pop(0))
while nCases>0:
    current_matrix, dimen = construct_matrix(data2)
    diag1 = 0
    diag2 = 0
    for i in range(dimen):
        diag1 += current_matrix[i, i]
        diag2 += current_matrix[dimen-i-1, i]
    print(diag1*diag2)
    nCases-=1
    print("\n")