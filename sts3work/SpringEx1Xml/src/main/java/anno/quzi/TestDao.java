package anno.quzi;

import org.springframework.stereotype.Component;

@Component
public class TestDao {

		public void insert(String name) {
			System.out.println(name+"�� DB�߰�");
		}
		
		public void delete(String num) {
			System.out.println(num+"�� ������ ����");
		}
		
		public void select(String name) {
			System.out.println(name+"���� �ֿ뱳�����Ϳ� �ٴմϴ�");
		}
}
