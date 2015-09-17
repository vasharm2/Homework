__author__ = "Thomas Fischer"

def anagramdrome(s):
    s = "".join(s.strip().split()).lower()
    s = "".join([c for c in s if c >= 'a' and c <= 'z'])
    counts = dict()
    for c in s:
        if c in counts.keys():
            counts[c] = counts[c] + 1
        else:
            counts[c] = 1
    if len(s) % 2 == 0:
        for key in counts.keys():
            if counts[key] % 2 > 0:
                return False
    else:
        usedFreebie = False
        for key in counts.keys():
            if counts[key] % 2 > 0:
                if usedFreebie:
                    return False
                else:
                    usedFreebie = True
    return True

def main():
    with open('Anagram.txt', 'r') as afile:
        data = [line for line in afile]
        T = int("".join(data[0].strip().split()))
        for line in data[1:T+1]:
            print(str(anagramdrome(line)).lower())

if __name__ == "__main__":
    main()
