package day2.review;

public class YourMemberServiceImpl implements MemberService{
	
	private MemberDao dao;
	//사용할 수 있는(의존관계 주입) 클래스를 MemberDao의 구현체로 합니다.	->인터페이스 만들때의 핵심!!!
	//해당클래스는 Mybatis~Dao, Jdbc~Dao 클래스 2개입니다.
	
	public void setDao(MemberDao dao) {		//의존관계주입 setter
		this.dao = dao;
	}
	
	public YourMemberServiceImpl() {
		System.out.println("YourMemberServiceImpl create//////");
	}
	
	@Override
	public void find(int idx) {
		//예) 검색 비지니스 로직 처리 : Your 방식으로
		System.out.println("My Logic~~~~~~");
		dao.find(idx);
	}
}
