public class ShakerSort 
{
    public static int[] shakerSort(int[] x) 
    {
      int temp;
        for(int i =0; i < (x.length/2); i++)
        {       
 
            for(int j = i; j<x.length-1-i; j++) 
            {
                if(x[j]>x[j+1]) {
                    temp = x[j];
                    x[j] = x[j+1];
                    x[j+1] = temp;
                } 
            }
            
            for(int k = x.length-2-i; k>i; k--) 
            {
                if(x[k] < x[k-1]) 
                {
                    temp = x[k];
                    x[k] = x[k-1];
                    x[k-1] = temp;
                } 
            }
        }

        return x; 
    }
    public static void displayArray(int[] x) 
    {
        for(int l=0; l<x.length; l++) 
            System.out.print(x[l] + " ");
    }

    public static void main(String[] args) 
    {
        int[] array = {10,11,3,2,5,8,1}; 
        int[] sorted = shakerSort(array); 
        displayArray(sorted);
    } 
}