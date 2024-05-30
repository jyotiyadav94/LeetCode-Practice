class Node:
    def __init__(self,key):
        self.left=None
        self.right=None
        self.val=key
    
    
root=Node(1);
print(root)
root.left=Node(2);
print(root.left)
root.right=Node(3);
print(root.right)
root.left.left=Node(4);
print(root.left.left)
    