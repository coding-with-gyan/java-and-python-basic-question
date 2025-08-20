//Read a number and check if it is divisible by 7


import java.util.Scanner;
public class Divisible {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();
        if(num%7==0){
            System.out.println("It is divisble by 7");
        }
        else{
            System.out.println("It is not divisible");
        }
        sc.close();
    }
}
