package day0128;


//����ƽ �׽�Ʈ
class InstCnt{

	static int instNum;

	//������
	public InstCnt() {
		instNum++;
		System.out.println("�ν��Ͻ�����: "+instNum);

	}
}
////////////////////////////////////
public class StaticVarEx_05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InstCnt cnt1= new InstCnt();
		InstCnt cnt2= new InstCnt();
		InstCnt cnt3= new InstCnt();
		//�̷��� 3���� �����ص� ��״� ������ �������� ���´�. ����X




	}

}

