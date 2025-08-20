//check wether the traingle is valid or not

import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the angle of first side: ");
        a=sc.nextInt();
        System.out.println("Enter the angle of second side: ");
        b=sc.nextInt();
        System.out.println("Enter the angle of third side: ");
        c=sc.nextInt();
        if(a+b+c==180){
            System.out.println("It is valid Triangle");
        }
        else{
            System.out.println("It is not a valid Traingle");
        }
        sc.close();
    } 
}
