a = int(input())
for i in range(a):
    b = list(map(int, input().split()))
    c = b[1:]
    d = sum(c) / len(c)
    count = 0
    for j in range(len(c)):
        if c[j] > d:
            count += 1
    e = (count / len(c)) * 100
    print(format(e, '.3f') + '%')
