class LinearSortedArray 
{
    int itemCount;
    int[] array;
    int maxSize = 1000;

    public LinearSortedArray() 
    {
        itemCount = 0;
        array = new int[maxSize]; 
    }
    
    public LinearSortedArray(int size) 
    {
        itemCount = 0;
        maxSize = size;
        array = new int[maxSize];
    }
    
    public void orderedInsert(int x) 
    {
        if(itemCount < array.length) 
        {
            int insertionPos = 0;
            while(insertionPos < itemCount && array[insertionPos] < x)
                insertionPos++;
            
            for(int k = itemCount; k > insertionPos; k--)
                array[k] = array[k-1];

            array[insertionPos] = x;
            itemCount++;
        }
        else
            System.out.print("Array is Full!");
    }
    
    public void orderedInsertAlt(int x)
    { 
        if(itemCount < array.length) 
        {
            int i;
            for(i = itemCount; i > 0 && array[i-1]>x; i--)
                array[i] = array[i-1]; array[i] = x; itemCount++;
        } 
        else
            System.out.print("Array is Full!");
    }
    
    public void orderedInsertRec(int x)
    {
        if(itemCount < array.length) 
            orderedInsertHlp (x, itemCount);
        else
            System.out.print("Array is Full!");
    }

    public void orderedInsertHlp (int x, int i) 
    {
        if (i>0 && x<array[i-1]) 
        {
            array[i] = array [i-1];
            orderedInsertHlp (x, i-1); }
        else 
        {
            array[i]=x;
            itemCount++;
            return;
        }   
    }
    public int binarySearchIter(int x) 
    {
        int lowerBound = 0;
        int upperBound = itemCount-1; 
        int pos;
        while(lowerBound <= upperBound) 
        {
            pos = (lowerBound+upperBound)/2; 
            if (array[pos] == x)
                return pos;
            else if(x > array[pos])
                    lowerBound = pos+1;
                 else
                    upperBound = pos-1;
         }
        return -1; 
    }
    public int binarySearchRec(int x) 
    {
        return binary(0, itemCount-1, x); 
    }
    
    public int binary(int lowerBound, int upperBound, int x) 
    {
        int pos = (lowerBound+upperBound)/2; 
        if(lowerBound > upperBound)
            return -1;
        else if(array[pos] == x)
            return pos;
        else if(x > array[pos])
            return binary(pos+1, upperBound, x); 
        else
            return binary(lowerBound, pos-1, x); 
    }

    public void delete(int x) 
    {
        int pos = this.binarySearchIter(x); 
        if(pos == -1)
             System.out.println("Element not found!"); 
        else
        {
            for(int i = pos; i < itemCount-1; i++)
                array[i] = array[i+1]; itemCount--;
        } 
    }

    public void displayArray() 
    {
        System.out.print("Sorted Array: "); 
        for(int i = 0; i < itemCount; i++) 
        {
            System.out.print(array[i] + " "); 
        }
        System.out.println(); 
    }

    public static void main(String [] args) 
    {
         LinearSortedArray b = new LinearSortedArray(10); 
         b.orderedInsert(5);
        b.orderedInsert(3);
        b.orderedInsert(1);
        b.orderedInsert(44);
        b.displayArray();
        System.out.println("Iteratively 5 at: " + b.binarySearchIter(5)); 
        System.out.println("Recursively 6 at: " + b.binarySearchRec(6)); 
        System.out.println("Recursively 5 at: " + b.binarySearchRec(5));
    } 
}