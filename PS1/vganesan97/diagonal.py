def diagonal(n):
    y=len(n0
    if n==1:
        return n;
    if n>1:
        for i in range(0,n):
            x=[0,0]
            x[0]=x[0]+(n[i][i])
            x[1]=x[1]+(n[y-i-1][y-i-1])
        return(x[0]*x[1])
    return 0
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