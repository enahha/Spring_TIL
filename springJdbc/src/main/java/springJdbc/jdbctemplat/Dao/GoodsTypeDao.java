package springJdbc.jdbctemplat.Dao;

import java.util.List;

import springJdbc.jdbctemplat.Dto.GoodsTypeDto;

public interface GoodsTypeDao {
	
	int create(GoodsTypeDto goodstypeDto);
	
	int update(GoodsTypeDto goodstypeDto);
	
	GoodsTypeDto read(int goodscode);
	
	List<GoodsTypeDto> read();
}