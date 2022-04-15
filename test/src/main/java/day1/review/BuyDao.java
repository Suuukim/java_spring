package day1.review;

public class BuyDao {
	
	private String dbFactory;
	
	public BuyDao(String dbFactroy) {
		System.out.println("BuyDao 생성자 *****");
		this.dbFactory=dbFactroy;
	}

	public void setDbFactory(String dbFactory) {
		this.dbFactory = dbFactory;
	}

	public void buy() {
		System.out.println("dao buy() ~~~~~~");
		System.out.println(dbFactory + "를 이용하여 db에 연결합니다.");
	}
}
