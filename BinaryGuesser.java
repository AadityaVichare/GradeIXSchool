import java.util.Scanner;

public class BinaryGuesser
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Keep in mind, a number between 1 and 30");
        System.out.println("A few grids will be presented");
        System.out.println("Enter 1 if you see your number, and 0 if you don't");
        System.out.println("1 3 5 7 9");
        System.out.println("11 13 15 17");
        System.out.println("19 21 23 25");
        System.out.println("27 29");
        int d1 = input.nextInt();
        int ans = d1*(int)Math.pow(2,0);
        System.out.println("2 3 6 7 10");
        System.out.println("11 14 15 18");
        System.out.println("19 22 23 26");
        System.out.println("27 30");
        int d2 = input.nextInt();
        ans = ans + (d2*(int)Math.pow(2,1));
        System.out.println("4 5 6 7 12");
        System.out.println("13 14 15 20");
        System.out.println("21 22 23 28");
        System.out.println("29 30");
        int d3 = input.nextInt();
        ans = ans + (d3*(int)Math.pow(2,2));
        System.out.println("8 9 10 11 12");
        System.out.println("13 14 15 24");
        System.out.println("25 26 27 28");
        System.out.println("29 30");
        int d4 = input.nextInt();
        ans = ans + (d4*(int)Math.pow(2,3));
        System.out.println("16 17 18 19 20");
        System.out.println("21 22 23 24");
        System.out.println("25 26 27 28");
        System.out.println("29 30");
        int d5 = input.nextInt();
        ans = ans + (d5*(int)Math.pow(2,4));
        System.out.println("Your number was: "+ans);
    }
}
