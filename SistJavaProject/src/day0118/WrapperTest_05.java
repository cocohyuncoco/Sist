package day0118;

public class WrapperTest_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//wrapper ��? Ŭ�������� ��ȯ���ִ� Ŭ������ ����Ŭ������ �Ѵ�.
		// ��Ʈ������ ������� �����Ҷ� int�� ��������ִ°�
		
		// string(���ڿ�)Ÿ���� int(����) Ÿ������ �����Ϸ���?
		// wrapper Ŭ���� �̿��ϱ�
		// Integer.parseInt("1"): ���ڿ�1�� ����1�� ��ȯ�ȴ�.
		
		// Double.parseDouble("12.5"): ���ڿ� 12.5�� �Ǽ�12.5�� ��ȯ�ȴ�.
		
		String su1="5";
		String su2="3";
		System.out.println("�μ� ���ϱ�: "+(su1+su2));

		//���ڿ� su1,su2�� ����Ÿ������ ��ȯ �� ����غ���
		//Wrapper class: �⺻���� Ŭ������ ���� ��ȯ�� ���� Ŭ����(Integer, Double, Long,)
		
		int num1=Integer.parseInt(su1);
		int num2=Integer.parseInt(su2);
		int addresult=num1+num2;
		
		System.out.println("��ȯ�� �μ� ���ϱ�:"+(num1+num2));
		System.out.println("��ȯ�� �μ� ���ϱ�:"+addresult);
		System.out.println("��ȯ�� �μ� ����:"+(num1-num2));
		System.out.println("��ȯ�� �μ� ���ϱ�:"+(num1*num2));
		System.out.println("��ȯ�� �μ� ������:"+(num1/num2)); //���������� ����� ������
		
	
	}

}
