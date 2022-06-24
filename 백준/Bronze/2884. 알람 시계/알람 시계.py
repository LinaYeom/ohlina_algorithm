H, M = map(int, input().split())

if 44 < M < 60: 
    M = M-45
    print(H , M)
elif 0 <= M <= 44:
    if(H==0):
        H=24
    H = H-1
    M = (60+M)-45
    print(H , M)