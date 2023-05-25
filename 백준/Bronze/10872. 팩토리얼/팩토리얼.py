a = int(input())
fac = 1
for i in range(a, 0, -1):
    if a == 0:
        print(fac)
    else:
        fac = fac * i

print(fac)
