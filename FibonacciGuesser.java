import java.util.Scanner;

public class FibonacciGuesser
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int ans = 0;
        System.out.println("Keep in mind, a number between 1 and 30");
        System.out.println("A few grids will be presented");
        System.out.println("Enter 1 if you see your number, and 0 if you don't");
        System.out.println("1 4 6 9");
        System.out.println("12 13 17 19");
        System.out.println("22 25 27 30");
        int d1 = input.nextInt();
        if(d1==1)
        {
            ans = 1;
        }
        System.out.println("2 7 10 15");
        System.out.println("20 23 28");
        int d2 = input.nextInt();
        if(d2==1)
        {
            ans = ans + 2;
        }
        System.out.println("3 4 11 12");
        System.out.println("16 17 24 25");
        System.out.println("29 30");
        int d3 = input.nextInt();
        if(d3==1)
        {
            ans = ans + 3;
        }
        System.out.println("5 6 7 18");
        System.out.println("19 20 26 27");
        System.out.println("28 29 30");
        int d4 = input.nextInt();
        if(d4==1)
        {
            ans = ans + 5;
        }
        System.out.println("8 9 10 11");
        System.out.println("12 21 22 23");
        System.out.println("24 25 26 27");
        System.out.println("28 29 30");
        int d5 = input.nextInt();
        if(d5==1)
        {
            ans = ans + 8;
        }
        System.out.println("13 14 15 16");
        System.out.println("17 18 19 20");
        System.out.println("21 22 23 24");
        System.out.println("25 26 27 28");
        System.out.println("29 30");
        int d6 = input.nextInt();
        if(d6==1)
        {
            ans = ans + 13;
        }
        System.out.println("Your number was: "+ans);
    }
}
