a = int(input())
b = int(input())
e = 0
for i in range(b):
    c, d = map(int, input().split())
    e = e + (c * d)
if e == a:
    print('Yes')
elif e != a:
    print('No')
