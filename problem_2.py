def gen_fibo(n):
    a = b = 1
    for i in xrange(n):
        yield a
        a, b = b, a + b


def memo_fibo(n):
    fibs = {0: 1, 1: 2}
    for i in xrange(2, n):
        fibs[i] = fibs[i - 1] + fibs[i - 2]
    return fibs


def fibs_upto(n):
    a = b = 1
    while a <= n:
        yield a
        a, b = b, a + b


def problem_2():
    return sum( [ i for i in fibs_upto(4000000) if i % 2 == 0 ] )


def main():
    print problem_2()


if __name__ == '__main__':
    main()
