
import java.util.Scanner;

public class NumberGuesser
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("I (java) shall attempt to guess any 2 digit");
        System.out.println("number which you can think of");
        System.out.println("Take the sum of the digits, and square it");
        System.out.println("Enter the answer here: ");
        int sq = sc.nextInt();
        System.out.println("Now multiply the digits together");
        System.out.println("Now multiply that answer by 4");
        System.out.println("Now subtract this answer in your mind from the previous answer you got");
        System.out.println("Enter that answer here: ");
        int sqm = sc.nextInt();
        int sumOfDigits = (int)Math.sqrt(sq);
        int diffOfDigits = (int)Math.sqrt(sqm);
        int a = (sumOfDigits+diffOfDigits)/2;
        int b = sumOfDigits - a;
        
        System.out.println("If the first digit is greater than second, press 1 or else, press 0");
        int ch = sc.nextInt();
        int ans = 0;
        if(ch==1){
            if(a>=b){
                ans = 10*a + b;
            }else{
                ans = 10*b + a;
            }
        }else{
            if(a>=b){
                ans = 10*b + a;
            }else{
                ans = 10*a + b;
            }
        }
        System.out.println("Your number must be: "+ans);
    }
}
