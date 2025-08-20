
//check if its is divisble by 3 or last digitt is 4



//eligible to vote exercise questions using if-else statements

import java.util.Scanner;
public class Vote{
    public static void main(String[] args){
        int num;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        if(num<18){
            System.out.println("You are not eligible to vote");
        } else{
            System.out.println("You are eligible to vote");
        }
        sc.close();

    }

}