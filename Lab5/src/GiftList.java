
public class GiftList 
{

	private Node head;

	
	public GiftList() 
	{
		this.head = null;
	}
	
	public boolean isEmpty()
	{
		if(head == null)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public boolean isFull()
	{
		Node temp = new Node();
		if(temp == null)
		{
			return true;
		}
		else
		{
			temp = null;
			return false;
			
		}
	}
	
	public boolean addGiftBasketToEnd(GiftBasket obj)
	{
		if(isFull())
		{
			System.out.println("List is full cant add another one");
		}
		else
		{
			Node temp = new Node(obj);
			if(isEmpty())
			{
				head = temp;
			}
			else
			{
				Node current = head;
				while(current.getnext()!=null)
				{
					current = current.getnext();
				}
				current.setnext(temp);
			}
		}
		return true;
		
	}
	public void showAllGiftBasket()
	{
		if(isEmpty())
		{
			System.out.println("List is empty nothing to show here");
		}
		else
		{
			Node current = head;
			while(current !=null)
			{
				current.getData().display();
				current = current.getnext();
			}
		}
	}
	
}
