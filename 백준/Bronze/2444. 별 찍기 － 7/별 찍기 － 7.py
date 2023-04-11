a = int(input())
for i in range(2 * a - 1):
    for j in range(2 * a - 1):
        if i <= (2 * a - 1)//2 and \
                (2 * a - 1)//2 - (i + 1) < j < (2 * a - 1)//2 + (i + 1):
            print('*', end='')
        elif i > (2 * a - 1)//2 and \
                (2 * a - 1)//2 - ((2 * a - 1) - 1 - i + 1) < j < (2 * a - 1)//2 + ((2 * a - 1) - 1 - i + 1):
            print('*', end='')
        else:
            if j < (2 * a - 1)//2:
                print(' ', end='')
    print()
