// Given 5 numbers a,b,c,d,e as input.Print the average of these 5 numbers

import java.util.Scanner;
public class Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b= sc.nextInt();
        System.out.println("Enter the third number: ");
        int c = sc.nextInt();
        System.out.println("Enter the fourth number: ");
        int d = sc.nextInt();
        System.out.println("Enter the fifth number: ");
        int e = sc.nextInt();
        double avg = (a+b+c+d+e)/5;
        System.out.println("The average of the 5 numbers is: "+avg);
        sc.close();
       
    }
    
}
