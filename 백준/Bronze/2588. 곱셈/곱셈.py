a = int(input())
b = input()
c = b.split()
for d in c:
    print(a * int(d[2]))
    print(a * int(d[1]))
    print(a * int(d[0]))
print(a*int(b))