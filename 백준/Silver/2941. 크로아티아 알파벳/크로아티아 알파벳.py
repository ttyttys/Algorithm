a = input()
b = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']
c = []
for i in range(len(b)):
    c.append(a.count(b[i]))
print(len(a) - sum(c))
