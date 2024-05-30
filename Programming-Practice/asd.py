def intersection(a,b):
    l=[]
    for i in a:
        for j in b:
            if i==j:
                l.append(i)
                break
            
    return l

def setIntersection(a,b):
    return list(set(a)&set(b))

a=[1,2,2,1]
b=[2,2]
a_list=list(set(a))
b_list=list(set(b))
print(intersection(a_list,b_list))
print(setIntersection(a,b))
