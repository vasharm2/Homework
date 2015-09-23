__author__ = "Thomas Fischer"

def stairs(n, maximum):
    for i in range(n):
        print(" " * (maximum - i - 1) + "#" * (i + 1))
    print

def main():
    with open("Stairs.txt", "r") as sfile:
        data = [line for line in sfile]
        T = int("".join(data[0].strip().split()))
        maximum = max([int(i.strip()) for i in data[1:T+1] if len(i.strip().split()) == 1])
        for line in data[1:T+1]:
            if len(line.strip().split()) == 1:
                stairs(int("".join(line.strip().split())), maximum)

if __name__ == "__main__":
    main()
