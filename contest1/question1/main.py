t = int(input())
for i in range(t):
    binaryList = list(input())
    for j in range(len(binaryList) - 1, -1, -1):
        if binaryList[j] == '0':
            binaryList[j] = '1'
            break
        else:
            binaryList[j] = '0'
    print(''.join(binaryList))