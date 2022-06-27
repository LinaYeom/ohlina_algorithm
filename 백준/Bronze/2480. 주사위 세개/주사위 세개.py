a , b, c = map(int, input().split())

if(a==b and b==c):
    print (10000+a*1000)
elif (a==b):
    print (1000+a*100)
elif (b==c):
    print (1000+b*100)
elif (a==c):
    print (1000+a*100) 
else:
    print (max(a,b,c)*100)
    
#     if(a<b and c<b):
#         print (b*100)
#     elif(a<c and b<c):
#         print (C*100)
#     else:
#         print (a*100)
# 파이썬 max 내장함수를 이용하면 좀 더 쉽게 사용할 수 있다. 