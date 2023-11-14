package springJdbc.jdbctemplat.rawmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import springJdbc.jdbctemplat.Dto.GoodsTypeDto;

public class GoodsTypeRowMapper implements RowMapper<GoodsTypeDto>{
	
	@Override
	public GoodsTypeDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		GoodsTypeDto goodstypeDto = new GoodsTypeDto();
		goodstypeDto.setGoodscode(rs.getInt(1))
					.setGoodsname(rs.getString(2));
		
		return goodstypeDto;
					
	}

}
