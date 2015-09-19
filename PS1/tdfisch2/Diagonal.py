__author__ = "Thomas Fischer"

def psumdiag(data):
    data = [[int(i) for i in line.strip().split() if line] for line in data]
    n = len(data)
    s1, s2 = 0, 0
    for x in range(n):
        s1 += data[x][x]
        s2 += data[x][n-x-1]
    return s1 * s2

def main():
    with open("Diagonal.txt", "r") as dfile:
        data = [line for line in dfile]
        T = int("".join(data[0].strip().split()))
        for indx, line in enumerate(data[1:]):
            if len(line.strip().split()) == 1:
                n = int(line.strip())
                print(psumdiag(data[indx+2:indx+2+n]))

if __name__ == "__main__":
    main()
