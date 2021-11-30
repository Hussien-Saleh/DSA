public class QueueMirror 
{
    public static QueueObj mirror(QueueObj original) 
    {
        QueueObj copy = new QueueObj(original.size()); 
        QueueObj result = new QueueObj(2*original.size());
        for (int i = 0;i < original.size();i++) 
        { 
            Object temp = original.dequeue(); 
            copy.enqueue(temp); 
            original.enqueue(temp);
        }
        while (!copy.isEmpty()) 
        {
            for (int i = 0;i < copy.size() - 1;i++) 
            {
                copy.enqueue(copy.dequeue());
            }
         result.enqueue(copy.dequeue());
        }
        while (!original.isEmpty()) 
            result.enqueue(original.dequeue());
        return result; 
    }
    public static void main(String[] args)
    { 
        QueueObj q = new QueueObj(5); 
        q.enqueue(new Integer(1)); 
        q.enqueue(new Integer(8));
        q.enqueue(new Integer(15));
         q.enqueue(new Integer(7)); 
         q.enqueue(new Integer(2)); 
         QueueObj mirrorQ = mirror(q); 
         mirrorQ.printQueue();
    } 
}