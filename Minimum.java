//Wap to print minimum of from three numbers

import java.util.Scanner;
public class Minimum {
    public static void main(String[] args){
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number: ");
        a=sc.nextInt();
        System.out.println("Enter the second number: ");
        b=sc.nextInt();
        System.out.println("Enter third number: ");
        c=sc.nextInt();
        if(a<b && a<c){
            System.out.println("A is minimum number");
        }
        else if(b<a && b<c){
            System.out.println("B is minimum number");
        }
        else{
            System.out.println("C is minimum number");

        }
        sc.close();

    }
    
}
