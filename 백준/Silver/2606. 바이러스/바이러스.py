#from collections import deque
import sys
read=sys.stdin.readline

n=int(input())
m=int(input())
#print(n,m)

vi=[0]*(n+1)
g=[[0]*(n+1) for _ in range(n+1)]

for _ in range(m):
  a,b=map(int, read().split())
  g[a][b]=g[b][a]=1


c=0
def dfs(v):
  global c
  
  vi[v]=1
  
  for i in range(1,n+1):
    if vi[i]==0 and g[v][i]==1:
      dfs(i)
      c+=1

dfs(1)
print(c)
  