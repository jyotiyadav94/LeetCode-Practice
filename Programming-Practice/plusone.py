def solve(a):
    
    if len(a)==1:
        if a[0]>=10:
            bb=str(a)[1:-1]
            b=map(int, str(bb))
            dl=list(b)
            return dl
        else:
            return [a[-1]+1]
    else:
        l=[]    
        for i in range(len(a)-1):
            l.append(a[i])
        c=l+[a[-1]+1]
        return c

a=[1]
print(solve(a))