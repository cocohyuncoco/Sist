package anno.quzi;

import org.springframework.stereotype.Component;

@Component
public class TestDao {

		public void insert(String name) {
			System.out.println(name+"님 DB추가");
		}
		
		public void delete(String num) {
			System.out.println(num+"번 데이터 삭제");
		}
		
		public void select(String name) {
			System.out.println(name+"님은 쌍용교육센터에 다닙니다");
		}
}
