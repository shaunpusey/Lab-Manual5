
public class driver {

	public static void main(String[] args)
	{
		GiftList obj = new GiftList();
		
		GiftBasket john = new GiftBasket(1,"John",200);
		GiftBasket sue = new GiftBasket(2,"Sue",500);
		GiftBasket jane = new GiftBasket(3,"Jane",500);
		
		obj.addGiftBasketToEnd(john);
		obj.addGiftBasketToEnd(sue);
		obj.addGiftBasketToEnd(jane);
		obj.showAllGiftBasket();
		
		

	}

}
