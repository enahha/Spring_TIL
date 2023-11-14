package springMybatis.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import springMybatis.dao.IMemberDao;
import springMybatis.dto.Member;
import springMybatis.dto.SelectionConditions;
import springMybatis.dto.UpdateCondition;

public class MemberDaoImpl implements IMemberDao{
	
	private SqlSessionTemplate sqlSessionTemplate;
	
	public MemberDaoImpl(SqlSessionTemplate sqlSessionTemplate){
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	
	@Override
	public Member findMemberById(int id) {
		return sqlSessionTemplate.selectOne("member.findMemberById", id);
											// 클래스 이름이 올 수 있음
	}
	
	@Override
	public int insertMember(Member member) {
		return sqlSessionTemplate.insert("member.insertMember", member);
	}
	
	@Override
	public int updateMenberById(int id, String address) {
		UpdateCondition uc = new UpdateCondition(id, address);
		return sqlSessionTemplate.update("member.updateMenberById", uc);
	}
	
	@Override
	public List<Member> findMemberList() {
		return sqlSessionTemplate.selectList("member.findMemberList");
	}
	
	@Override
	public List<Member> findMemberByAdd2(String address) {
		return sqlSessionTemplate.selectList("member.findMemberByAdd2", address);
	}
	
	@Override
	public Member findMemberByIdAndPass(int id, String pass) {
		SelectionConditions sc = new SelectionConditions(id, pass);
		return sqlSessionTemplate.selectOne("member.findMemberByIdAndPass", sc);
	}
}
