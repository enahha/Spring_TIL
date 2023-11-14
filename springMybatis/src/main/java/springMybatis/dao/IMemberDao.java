package springMybatis.dao;

import java.util.List;

import springMybatis.dto.Member;

public interface IMemberDao {
	
	Member findMemberById(int id);
	
	List<Member> findMemberList();
	
	List<Member> findMemberByAdd2(String address);
	
	Member findMemberByIdAndPass(int id, String pass);
	
	int insertMember(Member member);
	
	int updateMenberById(int id, String address);
	
	
}