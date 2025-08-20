# print all the factors/divisor of a given +ve number
n=int(input("enter the number: "))
if(n<0):
    print("number is not +ve")
else:
    i=1
    while(i<=n):
        if(n%i==0):
            print(i)
        i=i+1
