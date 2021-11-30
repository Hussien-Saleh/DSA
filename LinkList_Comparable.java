
class LinkList {
	private Link head;
	
	public LinkList()
	{
		head=null;
	}
	
	public void insertFirst(Comparable o) {
		Link newLink = new Link(o);
		newLink.next = head;
		head = newLink;
	}
	
	public Comparable removeFirst() {
		if (head == null)
		    return null;
		Comparable res = head.data;
		head = head.next;
		return res;
	}
	
	public Comparable getFirst() {
		return head.data;
	}
	
	public void insertLast(Comparable o) {
		Link newLink = new Link(o);
		if(head ==null) {
			head = newLink;
			return;
		}
		Link current = head;
		while(current.next != null)
			current = current.next;
		current.next = newLink;
	}
	
	public Comparable removeLast() {
		if (head==null)
			return null;
		if(head.next == null) {
			Comparable res = head.data;
			head = null;
			return res;
		}
		Link current = head;
		while(current.next.next != null)
			current = current.next;
		Comparable res = current.next.data;
		current.next = null;
		return res;
	}
	
	public Comparable getLast() {
		if (head==null)
		   return null;
		Link current = head;
		while(current.next != null)
			current = current.next;
		return current.data;
	}
	
	public boolean isEmpty()
	{
		return (head==null);
	}

	public String toString() {
		if(head == null)
			return "[ ]";
		String res = "[ " + head.data;
		Link current = head.next;
		while(current != null) {
			res += ", " + current.data;
			current = current.next;
		}
		res += " ]";
		return res;
	}
}

class Link {
	public Comparable data;
	public Link next;
	
	public Link(Comparable o) {
		this.data = o;
		this.next = null;
	}
	
	public String toString() {
		return data.toString();
	}
}
