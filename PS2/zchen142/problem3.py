
>>> def printStatement(times, foo):
	length = len(foo)
	i = 0
	while (i < times):
		j = 0
		print(end = "'")
		while (j < length):
			if j!=0:
				print(end = " ")
			print(foo[j], end = ""),
			j=j+1
		print("'"),
		i = i + 1

 
