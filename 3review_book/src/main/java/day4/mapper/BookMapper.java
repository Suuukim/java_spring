package day4.mapper;

import java.util.List;

import day4.dto.BookDto;

public interface BookMapper {
	
	void insert(BookDto dto);
	List<BookDto> selectAll();
	BookDto selectOne(String bcode);
	//같은이름 한꺼번에 바꾸는 단축키 alt + shift + r
}
