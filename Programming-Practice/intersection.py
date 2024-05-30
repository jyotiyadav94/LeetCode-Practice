def intersection(a):
    if a==1:
        return True
    while(a!=1):
        if a%4!=0:
            return False
        a=a/4
    return True
    
a=1
print(intersection(a))