#write a program to reverse the digits of a number
num=int(input("enter a number"))
num1=0
while num>0:
    num1=num1*10+(num%10)
    num=num//10
print(num1)