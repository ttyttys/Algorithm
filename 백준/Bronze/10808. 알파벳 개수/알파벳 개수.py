a = input()
s = [0 for i in range(26)]
for i in range(len(a)):
    s[ord(a[i]) - ord('a')] += 1

for i in range(len(s)):
    print(s[i], end=' ')
