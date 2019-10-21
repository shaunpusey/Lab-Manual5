
public class Node 
{
	private GiftBasket data;
	private Node next;
	
	public Node()
	{
		next= null;
		data = null;
	}
	 public Node(GiftBasket Data)
	 {
		 data =Data;
	 }
	 
	public Node(GiftBasket data, Node next) {
		this.data = data;
		this.next = next;
	}
	public GiftBasket getData() {
		return data;
	}
	public void setData(GiftBasket data) {
		this.data = data;
	}
	public Node getnext() {
		return next;
	}
	public void setnext(Node next) {
		this.next = next;
	}
	
	 

}
