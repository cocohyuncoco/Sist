package day0510.anno1;

import org.springframework.stereotype.Component;

@Component
//���̵� �����ָ� �ڵ����� MyDao���� �ձ��ڸ� �ҹ��ڷ� ���̵�� �� -> myDao
//@Component("my") <- ���̵� ���� �ٷ��� �̷���

public class MyDao implements daoInter {

	@Override
	public void insertData(String str) {
		// TODO Auto-generated method stub
		System.out.println(str+" �����͸� DB�� �߰� ����");
	}

	@Override
	public void deleteData(String num) {
		// TODO Auto-generated method stub
		System.out.println(num+" �� �ش��ϴ� ������ ���� ����");
	}

}
