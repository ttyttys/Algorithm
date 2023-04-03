a, b = input().split()
a1 = ''.join(reversed(a))
b1 = ''.join(reversed(b))
if int(a1) > int(b1):
    print(a1)
elif int(b1) > int(a1):
    print(b1)
