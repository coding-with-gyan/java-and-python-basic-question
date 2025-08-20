//check if its is divisble by 3 and last didgt is 4


import java.util.Scanner;

public class Div {
    public static void main(String[] args) {
    int num;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    num=sc.nextInt();
    if(num%3==0 && num%10!=4){
        System.out.println("It is divisble by 3 and last digit doesn't contains 4");
        if(num%3==0 && num%10==4){
            System.out.println("It is divisble by 3 and last digit contains 4");        }
    } else{
        System.out.println("It is not divisible by 3 and last digit does not contain 4");
    }
    sc.close();
}
}
