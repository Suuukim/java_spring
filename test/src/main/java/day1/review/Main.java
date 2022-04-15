package day1.review;

public class Main {
	public static void main(String[] args) {
		
	BuyDao dao = new BuyDao("Mybatis");
	BuyService service = new BuyService(dao);
	BuyController shop = new BuyController(service);
	
	shop.buy();
	
	}
}