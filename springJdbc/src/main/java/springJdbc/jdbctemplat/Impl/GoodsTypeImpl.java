package springJdbc.jdbctemplat.Impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import springJdbc.jdbctemplat.Dao.GoodsTypeDao;
import springJdbc.jdbctemplat.Dto.GoodsTypeDto;
import springJdbc.jdbctemplat.rawmapper.GoodsTypeRowMapper;


@Component("goodstypedao")
public class GoodsTypeImpl implements GoodsTypeDao {
	
	JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(GoodsTypeDto goodstypeDto) {
		
		String sql = "INSERT INTO GOODSTYPE(TYPECODE,TYPENAME) VALUES (?, ?)";
		
//		int cnt = jdbcTemplate.update(sql, "77777", "jdbcteml");
		int cnt = jdbcTemplate.update(sql, goodstypeDto.getGoodscode(), goodstypeDto.getGoodsname());
		
		return cnt;

	}
	
	@Override
	public int update(GoodsTypeDto goodstypeDto) {
		
		String sql = "UPDATE GOODSTYPE SET TYPENAME = ? WHERE TYPECODE = ?";
		
		int cnt = jdbcTemplate.update(sql, goodstypeDto.getGoodsname(), goodstypeDto.getGoodscode());
		
		return cnt;
	}
	
	// 하나만 가져올떄
	@Override
	public GoodsTypeDto read(int goodscode) {
		String sql="select * from GOODSTYPE WHERE TYPECODE = ?";
		GoodsTypeRowMapper rowmapper = new GoodsTypeRowMapper();
		GoodsTypeDto goodstype = jdbcTemplate.queryForObject(sql, rowmapper, goodscode);
		return goodstype;
	}
	
	// 리스트형식으로 가져올때
	@Override
	public List<GoodsTypeDto> read() {
		String sql="select * from GOODSTYPE";
		GoodsTypeRowMapper rowmapper = new GoodsTypeRowMapper();
		List<GoodsTypeDto> result = jdbcTemplate.query(sql, rowmapper);
		return result;
	}
	
	
	
	
	
	
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
