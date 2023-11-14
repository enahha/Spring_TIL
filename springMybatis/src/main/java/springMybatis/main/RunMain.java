package springMybatis.main;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import springMybatis.dao.IMemberDao;
import springMybatis.dto.Member;

public class RunMain {
	
	public static ClassPathXmlApplicationContext ctx;
	
	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext("classpath:/springMybatis/config.xml");
		int result = 0;
		
		IMemberDao memberDao = (IMemberDao)ctx.getBean("memberDao");
		
		// select
//		Member member = memberDao.findMemberById(1);
//		System.out.println(member);

		// insert
//		Member member2 = new Member(65, "werwer", "지드레곤", "용산구");
//		int result = memberDao.insertMember(member2);
//		System.out.println("영향을 받은 개수: " + result);
		
		// update
//		result = memberDao.updateMenberById(2, "주소바꿈");
//		System.out.println("영향을 받은 개수: " + result);
		
		// list select
		List<Member> memList = memberDao.findMemberList();
		for(Member mem : memList) {
			System.out.println(mem);
		}
		
		System.out.println("==========================");
		// 조건하나로 맞는 값 리스트로 출력
		memList = memberDao.findMemberByAdd2("한남동");
		for(Member mem : memList) {
			System.out.println(mem);
		}
		
		System.out.println("==========================");
		// 조건두개 리스트 출력
		Member member = memberDao.findMemberByIdAndPass(1, "qwer");
		System.out.println(member);
		
		ctx.close();
	}
}
