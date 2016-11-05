def mult_of(x, n):
    return x % n == 0


def problem_001(x):
    return sum((x for x in range(x) if x % 3 == 0 or x % 5 == 0))


def main():
    print problem_001(1000)

if __name__ == '__main__':
    main()
