package day0207;

import day0207.Employee_04;

//�ڽ�Ŭ����(sub)
public class Manager_04 extends Employee_04 {

	String depart;
	
	//�θ������ ��ӹ��� ����������� �ϼ�
	public Manager_04(String n, int s, String d) {
		
		
		super(n, s); //�θ������ ȣ��(ù��)
		this.depart=d; //���� �ν��Ͻ����� �ʱ�ȭ
	}
	
	
	//�θ��� �޼��带 ��ӹ޴°� �������̵�..�ּ� �׳� ���⵵ ������ �̿��� �޼��带 �ϼ��� �������� ����
	// ctrl+�����̽� ������ �θ�Ŭ������ Ŭ��
	@Override
	public String getEmployee() {
		// TODO Auto-generated method stub
		return super.getEmployee()+","+this.depart;
	}

		
	
	
}
