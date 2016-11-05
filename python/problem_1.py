def mult_gen(n, mults):
    """
    Return a generator containing the natural numbers below n that 
    are multiples of at least one number in mults.
    """
    for i in range(1, n):
        for m in mults:
            if i % m == 0:
                yield i
                break


def main():
    n = int(input('Upper limit on natural numbers to check: '))
    mults = list( map(int, input('Multiples: ').split(' ')) )
    print( sum(mult_gen(n, mults)) )

if __name__ == '__main__':
    main()
