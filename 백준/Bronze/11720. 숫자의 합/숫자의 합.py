a = int(input())
b = input()
c = [0]*a
for i in range(a):
    c[i] = int(b[i])
print(sum(c))