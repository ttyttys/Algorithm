a, b = map(int, input().split())
c = []
for i in range(a):
    c.append(i + 1)
for i in range(b):
    d, e = map(int, input().split())
    c[d - 1], c[e - 1] = c[e - 1], c[d - 1]
for i in c:
    print(i, end=' ')
