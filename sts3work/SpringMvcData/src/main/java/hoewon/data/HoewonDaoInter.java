package hoewon.data;

import java.util.List;
import java.util.Map;

public interface HoewonDaoInter {

		//count�޼���
		public int getToralCount();
		
		//insert
		public void insertHoewon(HoewonDto dto);
		
		//select
		public List<HoewonDto> getAllDatas(Map<String, String> map);

	
}
