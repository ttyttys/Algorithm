a, b = map(int, input().split())
c = list(map(int, input().split(' ')))
d = []
for i in range(len(c) - 2):
    for j in range(i+1, len(c)-1):
        for k in range(j+1, len(c)):
            if c[i] + c[j] + c[k] <= b:
                d.append(c[i] + c[j] + c[k])
print(max(d))
