package day0207_1;

import java.awt.geom.Arc2D.Float;

import day0207.Apple_09;
import day0207.Banana_09;
import day0207.Fruit_09;
import day0207.Orange_09;

public class FruitTest_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*#1_�ڽ�Ŭ���� �������� = new �ڽ�Ŭ����();
		Apple_09 app = new Apple_09();
		Orange_09 ora = new Orange_09();
		Banana_09 ban = new Banana_09();
		
		app.showMessage();
		ora.showMessage();
		ban.showMessage(); 
	 	*/
		//�̷����� ������ �� ����� �ֵ��ε� �ڽ��� 3�̴� ���� ���������� 3�̰Ե�
		//�������� �� ������ؼ� �����Ҷ����ִ�

		//#2_<������ó��>
		//���� �ڽĺ������� �ϳ��� ���������� �ִ°� = ������
		//�������� �ϳ��� ������ �������� ���� ó���Ҷ� �̿�
		//�������� ����Ŭ������ ����
		//(�θ�Ŭ������) (����������)=new (�ڽ�Ŭ������)();
		
		Fruit_09 fruit;
		
		fruit=new Apple_09();
		fruit.showMessage();
		
		fruit=new Orange_09();
		fruit.showMessage();
		
		fruit=new Banana_09();
		fruit.showMessage();
		
	}

}
