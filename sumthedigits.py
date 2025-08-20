# Take an integer N as input. Your task is to calculate and print the sum of the digits of the 
#given number N. 
a=int(input("enter the number: "))
sum=0
for i in range(len(str(a))):
    sum+=int(str(a)[i])
print(sum)