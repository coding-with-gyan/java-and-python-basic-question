#. WAP to check whether a year is a leap year or not. 
## Solution
year=int(input("enter year: "))
if year%4==0 and year %100!=0:
    print(year,"is a leap year")
else:
    print(year,"is not a leap year")