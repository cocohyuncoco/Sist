package data.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import data.dto.MarketDto;

//얘가 맵퍼다_얘가 없어도 에러나진 않음_SpringbootMybatisEx4Application.java에서 맵퍼등록 했기때문 
@Mapper
public interface MarketMapperInter {

	public int getTotalCount();
	
	public List<MarketDto> getAllDatas();
	
	public void insertMarket(MarketDto dto);
	
	public MarketDto getData(String num);
	
	public void updateMarket(MarketDto dto);
	
	public void deleteMarket(String num);
}
