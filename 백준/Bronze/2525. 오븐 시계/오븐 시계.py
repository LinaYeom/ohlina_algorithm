A, B = map(int,input().split())
C = int(input())
D = None

if (0<=C<1000):
    D = C//60
    if (0<D):
        A += D
        B = B+(C-D * 60)
    else : 
        B += C 
        
if(59<B):
    A += 1
    B -=60

if(23<A):
    A -= 24

print(A, B)
