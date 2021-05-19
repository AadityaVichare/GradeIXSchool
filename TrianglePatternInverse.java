 
 public class TrianglePatternInverse
{
   public static void main(String args[])
   {
       int lines = 4;
       int count;
       for(count = lines; count>0; count--)
       {
           //for initial spaces
           for(int k = 1; k<=lines-count; k++)
           {
               System.out.print("  ");
           }
           //for stars symbol
           for(int j = 1; j<=(count*2)-1; j++)
           {
               System.out.print("* ");
           }
           //for shifting to new line
           System.out.println();
       }
   }
}
 
