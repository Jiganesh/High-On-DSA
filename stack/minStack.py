# https://leetcode.com/problems/min-stack/
# Also Known as: Minimum element in stack

class MinStack:
    '''
    # brute force worse efficiency
    def __init__(self):
        self.items = []

    def push(self, val: int) -> None:
        self.items.append(val)

    def pop(self) -> None:
        return self.items.pop()

    def size(self):
        return len(self.items)

    def top(self) -> int:
    return self.items[-1]

    def getMin(self) -> int:
        return min(self.items)

    '''
    '''
    # without min() O(n)

    def __init__(self):
        self.items = []     #OG stack
        self.items2 = []    #2nd stack

    def top(self) -> int:
        return self.items[-1]
    
    def push(self, val: int) -> None:
        self.items.append(val)
        
        # if no element in stack2 append val directly
        # or stack2 top is greater than new no, append new no.
        if (len(self.items2)==0 or self.items2[-1]>= val):
            self.items2.append(val)     #ie min value is on stack2 top

    def pop(self) -> None:
        if (self.items2[-1]==self.items.pop()):
        # if the element we are poping from stack1 is same as current min
        # pop that ele from stack2 also
            return self.items2.pop()

    def getMin(self) -> int:
        return self.items2[-1]
    
    '''
    
    # O(1) most efficient

    def __init__(self):
        self.items = []     #OG stack
        self.mini = None    #min value

    def top(self) -> int:
        return self.items[-1]
    
    def push(self, val: int) -> None:
        self.items.append(val)
        
        # or stack2 top is greater than new no, append new no.
        if (self.mini==None or self.mini>= val):
            self.mini=val     #ie new no is min value

    def pop(self) -> None:
        print()
        popped=self.items.pop()
        if (self.mini==popped):
        # if the element we are poping from stack1 is same as mini, get new mini
            if len(self.items)>0:
                self.mini= min(self.items)
            else:
                self.mini=None

    def getMin(self) -> int:
        return self.mini

    

# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(val)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()
