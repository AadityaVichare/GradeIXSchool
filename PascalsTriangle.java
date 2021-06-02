import java.util.Scanner;

public class PascalsTriangle
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int lin = input.nextInt();
        
        /*for(int i = 1; i<=lin; i++)
        {
            int [] digits = new int[i];
            int pow = (int)Math.pow(11,i-1);
            for(int j = 1;j<=i; j++)
            {
                int digit = pow%10;
                pow = pow/10;
                digits[j-1] = digit;
            }
            for(int j = 1;j<=lin-i; j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++)
            {
                System.out.print(digits[j-1]+" ");
            }
            System.out.println();
        }*/
        int[][] pascal = new int[lin][2*lin];
        for(int i = 0; i<lin; i++)
        {
            for(int j = 0; j<2*lin; j++)
            {
                pascal[i][j] = ' ';
            }
        }
        for(int i = 0; i<lin; i++)
        {
            for(int k = 0;k<lin-i;k++)
               {
                   System.out.print(" ");
                }
            for(int j = 0; j<=i; j++)
            {
               if(i==j||j==0)
               {
                    pascal[i][j] = 1;
               }else
               {
                   pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
               }
               System.out.print(pascal[i][j]+" ");
            }
            System.out.println();
        }
        
        
    }
}
