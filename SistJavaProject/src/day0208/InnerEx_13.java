package day0208;


class OuterEx{
	
	int a=10;
	static int b=20; //정적변수
	
	class InnerEx{ //내부클래스
		
		int c=30;
		
		//static d = 40; //내부에서 static 선언못함
		public void write() {
			System.out.println("외부변수 a="+a);
			System.out.println("외부 정적변수 b="+b);
			System.out.println("외부변수 c="+c);
		}
		
		
	}
}

/////////////////////////////////////////
public class InnerEx_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OuterEx.InnerEx oie = new OuterEx().new InnerEx();
		oie.write();
		
		
	}

}
