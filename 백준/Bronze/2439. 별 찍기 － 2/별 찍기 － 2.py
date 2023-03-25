a = int(input())
for i in range(a):
    for j in range(a):
        if j >= (a-1) - i:
            print('*', end='')
        else:
            print(' ', end='')
    print()
