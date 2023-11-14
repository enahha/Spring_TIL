package springJdbc.jdbctemplat.Dto;

public class GoodsTypeDto {
	int goodscode;
	String goodsname;
	
	public int getGoodscode() {
		return goodscode;
	}
	public GoodsTypeDto setGoodscode(int goodscode) {
		this.goodscode = goodscode;
		return this;
	}
	public String getGoodsname() {
		return goodsname;
	}
	public GoodsTypeDto setGoodsname(String goodsname) {
		this.goodsname = goodsname;
		return this;
	}
	
	@Override
	public String toString() {
		return getGoodscode() + " ::: " + getGoodsname();
	}
}
