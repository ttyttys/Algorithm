a = list(map(int, input().split()))
s = 0
for i in range(len(a)):
    s += (a[i]) ** 2

print(s % 10)
