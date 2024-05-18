Link - https://www.techinterviewhandbook.org/grind75



1. Two Sum problem - https://leetcode.com/problems/two-sum/

Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

#### Example 1:

**Input:** 
```python
nums = [2,7,11,15], target = 9
```

Solution:
```python
def twoSum(self, nums, target):
    """
    :type nums: List[int]
    :type target: int
    :rtype: List[int]
    """
    for i in range(len(nums)):
        for j in range(i+1,len(nums)):
            if nums[i]+ nums[j]==target:
                return[i,j]

```


2. Valid Parentheses - https://leetcode.com/problems/valid-parentheses/description/



3. ListNode 
```python
class ListNode:
    def __init__(self,val=0,next=None):
        self.val=val
        self.next=next

def printlist(node):
    while node:
        print(node.val,end="->")
        node=node.next

def mergelinkedlist(l1,l2):
    head=ListNode()
    curr=head
    print(printlist(curr))
    while l1 and l2:
        if l1.val<l2.val:
            curr.next=l1
            l1=l1.next
        else:
            curr.next=l2
            l2=l2.next
        curr=curr.next
    curr.next = l1 if l1 else l2
    return head.next
    
    
        
def createlist(L2):
    L1=ListNode(0)
    temp=L1
    for i in L2:
        temp.next=ListNode(i)
        temp=temp.next
    return L1.next
    
        
def main():
    L2=[1,2,5]
    L2=createlist(L2)
    print(printlist(L2))
    L3=[1,3,4]
    L3=createlist(L3)
    print(printlist(L3))
    mergedlist=mergelinkedlist(L2,L3)
    print(printlist(mergedlist))
    return mergedlist
    




if __name__ =="__main__":
    main()
```
```python
3. Remove duplicates from the list 

def removeduplicates(l1):
    d={}
    for i,value in enumerate(l1):
        if value not in d:
            d[value]=i
    return d.keys()


def removeduplicates(l1):
    return set(l1)
            
s = "112344"
l1=[*s]
res=removeduplicates(l1)
print(res)
```

4. Remove Duplicates from the linked list
```python
def deleteDuplicates(l1):
    temp = ListNode()  # Create a dummy node to simplify the logic
    curr = temp
    d = {}

    while l1:
        if l1.val not in d:
            d[l1.val] = True
            curr.next = ListNode(l1.val)
            curr = curr.next
        l1 = l1.next

    return temp.next  # Skip the dummy node and return the next node

```
