b = 0
for i in range(5):
    a = int(input())
    if a < 40:
        a = 40
        b += a
    else:
        b += a
print(int(b / 5))
