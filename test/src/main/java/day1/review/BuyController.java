package day1.review;

public class BuyController {
	
	private BuyService service;
	
	public BuyController(BuyService service) {
		System.out.println("BuyController 생성자 *******");
		this.service=service;
	}
	
	public void setService(BuyService service) {
		this.service = service;
	}
	
	public void buy() {
		System.out.println("controller buy() ~~~~~");
		service.buy();
	}
}
