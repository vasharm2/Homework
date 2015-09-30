import sys
def printStatement(times, foo):
    length = len(foo);
    i = 1
    #sys.stdout.softspace = 0
    
    while i <= times:
        j = 0
        #print('\''),
        sys.stdout.write('\''),
        while j < length:
            print(foo[j]),
            #sys.stdout.write(foo[j]),
            j = j + 1
    	sys.stdout.write('\'')
    	print('')
    	i = i + 1

printStatement(3, ['C','S','1','9','6'])