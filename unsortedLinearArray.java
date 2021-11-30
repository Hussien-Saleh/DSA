class LinearArray
{
    int[] array;
    int maxSize = 1000;
    
    public LinearArray() 
    {
        itemCount = 0;
        array = new int[maxSize]; }

    public LinearArray(int size)
    {
        itemCount = 0;
        maxSize = size;
        array = new int[maxSize];
    }
    
    public void insertLast (int x)
    {
        if(itemCount < array.length) 
             array[itemCount++] = x;
        else
             System.out.print("Array is Full");
    }
    public void insertFirst(int x) 
    {
        if (itemCount < array.length) 
        {
            for(int i = itemCount; i > 0; i--) array[i] = array[i-1];
            array[0] = x;
            itemCount++;
        } 
        else
            System.out.print("Array is Full"); 
        }

    public int linearSearch(int x)
    {
        for(int i = 0; i < itemCount; i++) 
            if(array[i] == x)
                 return i;
         return -1;
    }
    
    public void delete(int x)
    {
         int pos = this.linearSearch(x); 
         if(pos == -1)
            System.out.println("Element not found!"); 
        else
        {
            for(int i = pos; i < itemCount - 1; i++)
            array[i] = array[i+1]; itemCount--;
        } 
    }
    
    public void displayArray() 
    {
        System.out.print("Array: "); 

        for(int i = 0; i < itemCount; i++)
            System.out.print(array[i] + " "); 
        System.out.println();
    }
    
    public static void main(String [] args) 
    {
        LinearArray a = new LinearArray();
        a.insertLast(3);
        a.insertLast(7);
        a.insertFirst(8);
        a.displayArray();
        System.out.println("Count: " + a.itemCount); 
        System.out.println("Position of 5: " + a.linearSearch(5)); a.delete(33);
        a.delete(3);
        System.out.println("Count: " + a.itemCount);
    }
}