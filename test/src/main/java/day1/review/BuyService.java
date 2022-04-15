package day1.review;

public class BuyService {
	
	private BuyDao dao;
	
	public BuyService(BuyDao dao) {
		System.out.println("BuyService 생성자 *****");
		this.dao=dao;
	}
	
	public void setDao(BuyDao dao) {
		this.dao = dao;
	}
	
	public void buy() {
		System.out.println("service buy()");
		dao.buy();
	}
}
