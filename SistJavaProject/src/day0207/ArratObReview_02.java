package day0207;



class Menu{
	
	static int no;
	private String foodName;
	private int price;
	private String bigo;
	
	//����� �����ڷ� 3��
	
	public Menu(String foodName, int price, String bigo) {
		this.foodName = foodName;
		this.price = price;
		this.bigo = bigo;
	}
	
	//���̺�_showTitle
	public static void showTitle() {
		System.out.println("No.\t���ĸ�\t����\t��");
		System.out.println("===============================");
		
	}
		
	//���_showMenu
	public void showMenu() {
		no++;
		System.out.println(no+"\t"+this.foodName+"\t"+this.price+"\t"+this.bigo);
	}
	
}
///////////////////////////////
public class ArratObReview_02 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�迭�λ���.. 4�� �ʱⰪ �ָ鼭 ����
		Menu [] me = {
				new Menu("������",8500,"��õ�޴�"),
				new Menu("������",7000,"�α�޴�"),
				new Menu("�޹���",9000,"1���޴�"),
				new Menu("����",15000,"����̽�ȸ��õ")
		};
		
		
		Menu.showTitle();
		
		for (Menu m:me){
			m.showMenu();			
		}
	 
		
		
	}

}
