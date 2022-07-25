package data.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import data.Dto.IpgoDto;
import data.Dto.MemberDto;

@Mapper
public interface MemberMapperInter {

	//등록
	public void insertMember(MemberDto dto);
	
	//전체출력
	public List<MemberDto> getAllMembers();
	
	//id중복체크
	public int getSerchId(String id);
	
	//id를 통해서 이름얻기
	public String getName(String id);
	
	//로그인_id, pass
	public int login(HashMap<String, String> map);
	
	//삭제
	public void deleteMember(String num);
}
