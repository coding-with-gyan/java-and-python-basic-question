#Take an integer A as input You have to tell whether A is divisible by both 5 and 11 or 
#not
a=int(input("enter the number: "))

if (a%5==0 and a%11==0):
    print("yes it is divisible by 5 and 11 both")
elif(a%5==0 and a%11!=0):
    print("yes it is divisible by 5 but not by 11")
elif(a%5!=0 and a%11==0):
    print("yes it is divisible by 11 but not by 5")
else:
    print("no it is not divisible by 5 and 11 both")