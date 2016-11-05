def fibs_to(lim):
    fibs = [1, 2]
    while sum(fibs[-2:]) <= lim:
        fibs.append(fibs[-1] + fibs[-2])
    return fibs


def main():
    print sum(filter(lambda x: x % 2 == 0, fibs_to(4000000)))


if __name__ == '__main__':
    main()
