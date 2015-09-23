#!/usr/bin/env python

infile = open("Diagonal.txt");

cases = int(infile.readline().strip())
lefttotal = 0
righttotal = 0

for i in range(cases):
    nextline = ""
    while nextline == "":
        nextline = infile.readline().strip()
    
    rows = int(nextline.strip())

    for row in range(rows):
        nextline = infile.readline().strip()
        while nextline == "":
            nextline = infile.readline.strip()
        arrayrow = [int(val) for val in nextline.split()]
        lefttotal += arrayrow[row];
        righttotal += arrayrow[rows - row - 1];

    print(lefttotal * righttotal)
    lefttotal = 0
    righttotal = 0
