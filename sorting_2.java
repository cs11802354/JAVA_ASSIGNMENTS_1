import java.util.ArrayList;
import java.util.Scanner;

public class sorting_2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int tescases = scan.nextInt();
        for(int i=0;i<tescases;i++)
        {
            long arraySize=scan.nextInt();
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0;j<arraySize;j++)
            {
                int randomNum =(int)(Math.random()*100);
                temp.add(randomNum);
            }
//            for(int j=0;j<temp.size();j++)
//            {
//                System.out.println(temp.get(j));
//            }
            double startTime=System.nanoTime();
            sort(temp,0,temp.size()-1);
            double endTime=System.nanoTime();
            System.out.println("N = "+arraySize+"\t\t"+"Time Taken = "+(endTime-startTime)/1000000000.0);
 //           System.out.println("------------------");
//            for(int j=0;j<temp.size();j++)
//            {
//                System.out.println(temp.get(j));
//            }

        }

    }
  public static void sort(ArrayList<Integer> arr, int l, int r)
    {
        if (l < r)
        {

            int m = (l+r)/2;             // Find the middle point
            sort(arr, l, m);              // Sort first and second halves
            sort(arr , m+1, r);
            merge(arr, l, m, r);            // Merge the sorted halves
        }
    }
   public static void merge(ArrayList<Integer> arr, int l, int m, int r)
    {

        int n1 = m - l + 1;      // Find sizes of two subarrays to be merged
        int n2 = r - m;

        int L[] = new int [n1];    /* Create temp arrays */
        int R[] = new int [n2];

        for (int i=0; i<n1; ++i)       /*Copy data to temp arrays*/
            L[i] = arr.get(l+i);
        for (int j=0; j<n2; ++j)
            R[j] = arr.get(m + 1+ j);



        int i = 0, j = 0;                            /* Merge the temp arrays */

        int k = l;
        while (i < n1 && j < n2)               // Initial indexes of first and second subarrays
                                               // Initial index of merged subarry array
        {
            if (L[i] <= R[j])
            {
                arr.set(k,L[i]);
                i++;
            }
            else
            {

                arr.set(k,R[j]);
                j++;
            }
            k++;
        }                                    /* Copy remaining elements of L[] if any */
        while (i < n1)
        {

            arr.set(k,L[i]);
            i++;
            k++;
        }                                       /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr.set(k,R[j]);
            j++;
            k++;
        }
    }
}
