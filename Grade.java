
import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the percentage of the student:");
        n=sc.nextInt();
        if(n>=95 &&n<=100){
            System.out.println("Grade A+");
        } else if(n>=90 &&n<95){
            System.out.println("Grade A");
        } else if(n>=85 && n<90){
            System.out.println("Grade B+");
        } else if(n>=80 && n<85){
            System.out.println("Grade B");
        } else{
            System.out.println("Grade C");
        }
        sc.close();

    }
    
}
