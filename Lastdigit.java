
//check if last digit is 4

import java.util.Scanner;
public class Lastdigit {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();
        if(num%10==4){
            System.out.println("Last digit is 4");
        }
        else{
            System.out.println("Last digit is not 4");
        }
        sc.close();
    }
    }
