- [x] cmp_to_key

```python

from functools import cmp_to_key


def cmp (x, y):
    if x < y: return -1  # negative Value if x < y them x should appear first
    if x > y  : return 1   # positive Value if x > y then x should appear last
    if x == y : return 0  # order doesn't matter
    
# Above Function Can also be written as :
def cmp(x, y):
    print(x, y , x-y)
    return x-y  # if x is smaller it will return negative value which means x should appear first
    
a = sorted([3,1,1,2], key= cmp_to_key(cmp))
print(a)
```

- [x] defaultdict

``` python
nested_dictionary = defaultdict( lambda: defaulddict(int))
```

Partitions
```python

original = [1,2,3,4]
elements = 2

array = iter(original)
matrix = [*zip(*elements*(array,))]

#matrix = [[1,2],[3,4]]

```

MOD = 10**9 +7

Extend in 2D chain

```python
list(itertools.chain.from_iterable(sorted_buckets))
```

```python
#EdgeCase when sequence is Empty 
max([] , default = 1)

```


Condition and IF TRUE or IF FALSE
```python
n = 5
result = n%2==0 and "EVEN" or "ODD"
```

fractions module 

Link : https://www.tutorialspoint.com/fraction-module-in-python
```python

from fractions import Fraction

n2 = 36
d2 = 64

num = 33.33

print(Fraction(n2, d2))  # output :  9/16
print(Fraction(num)) # output : 2345390243441541/70368744177664
print(Fraction(str(num))) # output : 3333/100
print(Fraction(0.25)) # output 1/4
print(Fraction(0.25).numerator) # output 1
print(Fraction(0.25).denominator) # output 45



```


GCD Learn From : https://www.youtube.com/watch?v=utZcJ0leZ_g

```python


a = 96
b = 64

# a is dividend
# b is divisor

def gcd (a,  b):
    
    if b ==0 : return a
    else: return gcd(b , a%b)
    
print(gcd(a, b))
```

Fractions Like GCD
```python

a = 96
b = 64


def gcd (a, b):
    if b==0 : return a 
    else : return gcd(b , a%b)
    
gcd_ab = gcd(a, b)
num = a//gcd_ab
den = b//gcd_ab

result = (num, den) # output (3, 2) and gcd_ab is 32

```


Technique for remembering a change : You can convert it to negative of its value

Copying 2D array
```python
matrix = [row[:] for row in grid]
```

Segmentation Tree :https://www.youtube.com/watch?v=I7RFycpqbDk


Number of Node in tree of  height h 
```
number_of_nodes = 2 * (2**h)- 1

```

Transpose of a matrix 

```
transpose_matrix = list(map(list, zip(*matrix)))
```

Find Valid Rectangles from given points
```
points = [[1,1],[1,3],[3,1],[3,3],[4,1],[4,3]]

hashset = set(map(tuple, points))

for point1 in hashset:
    for point2 in hashset:
        
        '''point1 and point2 are diagonal with direction  \ '''

        x1, y1 = point1
        x2, y2 = point2
        
        if x1 < x2 and y1 < y2 and (x1, y2) in hashset and (x2, y1) in hashset:
            print(  "Rectangle : ", point1, (x1, y2) , (x2, y1), point2 )

```