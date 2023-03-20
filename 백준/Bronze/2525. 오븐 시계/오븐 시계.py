a, b = map(int, input().split())
c = int(input())
d = a + ((b+c) // 60)
if b + c < 60:
    print(a, b + c)
elif d >= 24 and b + c >= 60:
    print(d-24, (b + c) % 60)
elif d < 24 and b + c >= 60:
    print(d, (b + c) % 60)