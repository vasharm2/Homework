def printStatement(times, foo):
    length = len(foo);
    i = 0
    while i < times:
        j = 0
        while j < length:
            print(foo[j]),
            j = j + 1
        print('')
        i = i + 1

printStatement(3, ['C','S','1','9','6'])