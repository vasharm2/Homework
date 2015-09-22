
def printStatement(times, foo):
    length = len(foo);
    i = 0
    while i < times:
        j = 0
        while j <= length-1:
            print(foo[j]),
            j +=1
        print('')
        i+=1

printStatement(3, ['C','S','1','9','6'])
