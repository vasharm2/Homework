def diagonal(input):
    rows = len(input)
    Diag = [0,0]

    for i in range(0,rows):
        Diag[0] += int(input[i][i])
        print(input[i][i])
        Diag[1] += int(input[rows-i-1][i])    
        print(input[rows-i-1][rows-i-1])
    return (Diag[0]*Diag[1])

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
except (IOError) as e:
    print(e)
