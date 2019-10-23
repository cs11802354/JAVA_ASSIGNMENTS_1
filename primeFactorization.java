import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

public class primeFactorization
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int testcases = scan.nextInt();
        for (int i = 0; i < testcases;i++)
        {
            int givenNo=scan.nextInt();
            System.out.print(givenNo+" = ");
            double startTime=System.nanoTime();
            primeFactor(givenNo);          // calling the function to print all prime factor of that give no.
            double end =System.nanoTime();
            System.out.print("Time Taken = "+(end-startTime)/1000000000.0);
            System.out.println();
        }

    }
    public static void primeFactor(int n)
    {
        int save =n;
        for(int j=2;j<=Math.sqrt(n);j=j+2)
        {
            ArrayList<Integer> temp = new ArrayList<>();
            if(j==2)             // starting with j=2 and iterating till n is divided by 2
            {
                while(n%2 == 0)
                {
                    temp.add(2);
                    if(n/2==1)
                    {
                        System.out.print(j+"\t\t");
                    }else
                    System.out.print(2+"*");
                    n=n/2;

                }          // when n is not divisible by two it will come out of that loop and updating the j value to j=3
                j=3;
            }
            while(n%j == 0)   // diving by a particular till the remainder is coming out to be 0;
            {
                temp.add(j);
                if(n/j==1)
                {
                    System.out.print(j+"\t\t");
                }else
                System.out.print(j+"*");
                n=n/j;

            }            // if not then incrementing to j=j+2 and again iterating through this while loop

        }
        if(n>=2)
        {
           if(save==n)
           {
               System.out.print("Prime"+"\t\t");
           }else
            System.out.print(n+"\t\t");
        }

    }
}
