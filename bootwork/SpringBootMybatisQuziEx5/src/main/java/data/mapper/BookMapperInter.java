package data.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import data.dto.BookDto;
 
@Mapper
public interface BookMapperInter {

	public int getTotalCount();
	
	public List<BookDto> getAllDatas();
	
	public void insertBook(BookDto dto);
	
	public BookDto getData(String num);
	
	public void updateBook(BookDto dto);
	
	public void deleteBook(String num);
}
