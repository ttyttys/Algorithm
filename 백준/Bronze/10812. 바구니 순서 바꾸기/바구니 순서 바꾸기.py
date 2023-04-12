a, b = map(int, input().split())
c = [0] * a
n = []
for i in range(a):
    c[i] += i+1
for i in range(b):
    d, e, f = map(int, input().split())
    n = c[f-1:e] + c[d-1:f-1]
    c[d-1:e] = n

print(*c)