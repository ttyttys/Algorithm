a = list(input())
if a[0] == ' ' and a[-1] != ' ':
    print(a.count(' '))
elif a[-1] == ' ' and a[0] != ' ':
    print(a.count(' '))
elif a[0] == ' ' and a[-1] == ' ':
    print(a.count(' ') - 1)
else:
    print(a.count(' ') + 1)
