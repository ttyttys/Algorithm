a, b = map(int, input().split())
c = list(map(int, input().split()))
for i in range(len(c)):
    if c[i] < b:
        print(c[i], end=' ')
