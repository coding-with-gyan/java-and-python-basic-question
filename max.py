#Write a program to input two numbers(A & B) from the user and print the maximum 
#element among A & B. 
a = int(input("Enter the first number: "))
b = int(input("Enter the second number: "))
if a > b:
    print("The maximum number is: ", a)
else:
    print("The maximum number is: ", b)