
# Intersection of Two Arrays II

def intersection(a,b):
    output=[]
    for i in a:
        if i in b:
            output.append(i)
            b.remove(i)
    return output


a=[1,2,2,1]
b=[2]
#print(b.remove(b[0]))

print(intersection(a,b))
