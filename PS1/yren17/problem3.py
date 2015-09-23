def printStatement(times, foo):
    length = len(foo)
    i = 0
    while i <times:
        j = 0
        print "'",
        while j < length:
            print(foo[j]),
            j = j + 1
        i = i + 1
        print "'"

printStatement(3, ['C','S','1','9','6'])