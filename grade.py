#Accept the percentage from the user and display the grade according to the following 
#criteria. 
a=int(input("enter the percentage: "))
if(a>=85 and a<=100):
    print("grade A+")
elif(a>=65 and a<=85):
    print("grade A")
elif(a>=45 and a<65):
    print("grade B")
elif(a>=25 and a<45):
    print("grade C")
else:
    print("grade D")