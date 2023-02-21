#from collections import deque
import sys
read=sys.stdin.readline

n=int(input())

a=[list(map(int, input())) for _ in range(n) ]

r=0
def dfs(x,y):
  
  if x<=-1 or x>=n or y<=-1 or y>=n:
    return 0
  
  if a[x][y]==1:
    a[x][y]=0
    global r
    r+=1
    dfs(x,y+1)
    dfs(x,y-1)
    dfs(x+1,y)
    dfs(x-1,y)
    
    return r
  
  return 0

c=0
l=[]
for i in range(n):
    for j in range(n):
      re=dfs(i,j)
      if re!=0:
        c+=1
        l.append(re)
        r=0
        
print(c) 
l.sort()
for i in l:
  print(i)