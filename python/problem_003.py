from math import floor, sqrt

def sieve(up_to):
    numbers = list(range(up_to + 1))
    l = set([ x for x in range(2, up_to + 1) ])
    for i in l:
        i_s = set([ i * x for x in numbers  if i * x <= up_to ])
        l = l - i_s 
    return l

def sieve2(n):
    A = { i: True for i in range(2, n+1)} 
    for i in range(2, int(sqrt(n))+1):
        if A[i]:
            for j in range(i**2, n, i):
                A[j] = False
    return [ k for k in A if A[k] ]
