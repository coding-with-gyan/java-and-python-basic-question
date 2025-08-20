#. Read three angles of triangles and determine their types(Right triangle, Obtuse 
#triangle, Acute triangle). 
a=int(input("enter the first angle:"))
b=int(input("enter the second angle:"))
c=int(input("enter the third angle:"))
d=a+b+c
if (d==90):
    print("Right triangle")
elif (d<90):
    print("Acute triangle")
else:
    print("Obtuse triangle")