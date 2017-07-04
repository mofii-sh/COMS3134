def fib(n):
    x = n==1
    y = n==2
    z = x or y
    if z:
        return 1
    return fib(n-1) + fib(n-2)

print (fib(100))