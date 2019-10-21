
public class GiftBasket 
{
	private int id;
	private String type;
	private float cost;
	
	
	public GiftBasket()
	{
		this.id = 0;
		this.type = null;
		this.cost = 0;
	}


	public GiftBasket(int id, String type, float cost) {
		this.id = id;
		this.type = type;
		this.cost = cost;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public float getCost() {
		return cost;
	}


	public void setCost(float cost) {
		this.cost = cost;
	}
	
	
	public void display()
	{
		System.out.println(" Id: "+id+" Type: "+type+" Cost: "+cost);
	}
	
	
	

}
