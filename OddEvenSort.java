public class OddEvenSort {
    
    public static int[] oddEvenSort(int[] x) 
    {
        int temp;
        for(int k=0; k< (x.length/2) + 1; k++) 
        {
            for(int j=1; j<x.length-1; j=j+2) 
            {
                if(x[j]>x[j+1]) {
                temp = x[j];
                x[j] = x[j+1];
                x[j+1] = temp;
                 }      
            }
            for(int i=0; i<x.length-1; i=i+2) 
            {
                if(x[i]>x[i+1]) 
                {
                    temp = x[i];
                    x[i] = x[i+1];
                     x[i+1] = temp;
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
        int[] array = {6,5,4,3,2,1};
        int[] sorted = oddEvenSort(array); 
        displayArray(sorted);
    } 
}
         