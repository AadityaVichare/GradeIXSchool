import java.util.*;

public class StandardDeviation
{
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of data: ");
            int n = sc.nextInt();
            double [] data = new double[n];
            double sum = 0;
            System.out.println("Enter values: ");
            for(int i = 0; i<=n-1; i++)
            {
                data[i] = sc.nextDouble();
                sum = sum + data[i];
            }
            double mean = sum/n;
            double dsum = 0;
            for(int i = 0; i<=n-1; i++)
            {
                double diff = mean - data[i];
                dsum = dsum + Math.pow(diff,2);
            }
            double standardDev = Math.sqrt(dsum/n);
            System.out.println("The mean is: "+mean);
            System.out.println("The standard deviation is: "+standardDev);
        }
}
