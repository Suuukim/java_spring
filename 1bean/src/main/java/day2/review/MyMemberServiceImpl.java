package day2.review;

public class MyMemberServiceImpl implements MemberService{

	private MemberDao dao;
	//사용할 수 있는(의존관계 주입) 클래스를 MemberDao의 구현체로 합니다.	->인터페이스 만들때의 핵심!!!
	//해당클래스는 Mybatis~Dao, Jdbc~Dao 클래스 2개입니다.
	
	//MyMemberServiceImpl은 커스텀생성자 , 생성자 의존관계 주입으로 변경해서 해보세요.
	
//	public MyMemberServiceImpl() {
//		System.out.println("MyMemberSerivceImpl create//////");
//	}
	
	public MyMemberServiceImpl(MemberDao dao) {
		System.out.println("MyMemberSerivceImpl create//////");
		this.dao=dao;
	}
	
	public void setDao(MemberDao dao) {		//의존관계주입 setter
		this.dao = dao;
	}
	
	@Override
	public void find(int idx) {
		//예) 비즈니스 로직 처리 : My 방식으로
		System.out.println("Your Logic~~~~~");
		dao.find(idx);
	}
}
