package day0209;

public class _15_StringBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//���ڿ�����, ��������� �߰��� �ڷ���
		StringBuffer sb = new StringBuffer();
		
		sb.append("Happy");
		sb.append("Nice");
		sb.append(200);
		sb.append(3.14);
		sb.append('A');
		System.out.println(sb);
		
		sb.insert(5, "Apple"); //5�� �ε��� �տ� Apple �߰�
		System.out.println(sb);
		
		sb.delete(5, 10); //5~9������ ����
		System.out.println(sb);
		
		sb.replace(5, 9, "Angel"); //5~8�������� Angel�� ��ü
		System.out.println(sb);
	}

}
