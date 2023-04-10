a = list(input().split())
b = [1, 1, 2, 2, 2, 8]
c = [0] * 6
for i in range(len(a)):
    if a[i] == b[i]:
        c[i] = 0
    else:
        c[i] = int(b[i]) - int(a[i])

print(*c)
