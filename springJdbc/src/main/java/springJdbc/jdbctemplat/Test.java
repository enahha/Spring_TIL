package springJdbc.jdbctemplat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import springJdbc.jdbctemplat.Dao.GoodsTypeDao;
import springJdbc.jdbctemplat.Dto.GoodsTypeDto;

public class Test {
	private static ApplicationContext ctx = null;
	
	public static void main(String[] args) {
		String path = "classpath:springJdbc/jdbctemplat/config.xml";
		
		ctx = new ClassPathXmlApplicationContext(path);
		GoodsTypeDao goodstypeDao = (GoodsTypeDao)ctx.getBean("goodstypedao");
		
		GoodsTypeDto goodstypeDto = new GoodsTypeDto();
		goodstypeDto.setGoodscode(77777)
					.setGoodsname("되라되라");
	
//		int cnt = goodstypeDao.create(goodstypeDto);
		int cnt = goodstypeDao.update(goodstypeDto);
		
		System.out.println("영향받은 계수::" + cnt);

	}
}
