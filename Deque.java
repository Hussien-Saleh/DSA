class Deque
{
    
    private Object[] elements; 
    private int maxSize; 
    private int front;
    private int rear;
    private int nItems;

    public Deque(int size) 
    {
        maxSize = size;
        elements = new Object[maxSize];
        front = 0;
        rear = maxSize-1;
        nItems = 0;
    }
    public void insertFirst(Object item)
    {
        front--; 
        if(front == -1)
            front = maxSize - 1;
        elements[front] = item;
        nItems++; 
    }

    public void insertLast(Object item)
    {
        rear++;
        if(rear ==maxSize)
             rear = 0;
        elements[rear]=item;
        nItems++; 
    }

    public Object removeFirst()
    {
        Object temp = elements[front];
        front++;
        if(front == maxSize)
            front = 0;
        nItems--;
        return temp;
    }

    public Object removeLast()
    {
        Object temp = elements[rear];
        rear--;
        if (rear == -1)
          rear = maxSize - 1;
         nItems--;
        return temp; 
    }
    public Object peekFront()
    { 
        return elements[front];
    }

    public Object peekRear()
    {
        return elements[rear]; 
    }
    public boolean isEmpty()
    { 
        return (nItems==0);
    }
    public boolean isFull()
    { 
        return (nItems==maxSize);
    }
    public int size()
    { 
        return nItems;
    }
    public static void main(String[] args)
    { 
        Deque d = new Deque(5); 
        d.insertFirst(new Integer(3)); 
        d.insertFirst(new Integer(2)); 
        d.insertFirst(new Integer(1)); 
        d.insertLast(new Integer(4)); 
        d.insertLast(new Integer(5)); 
        System.out.println(d.removeFirst()); 
        System.out.println(d.removeLast()); 
        System.out.println(d.peekFront()); 
        System.out.println(d.isEmpty()); 
        System.out.println(d.isFull());
    } 
}