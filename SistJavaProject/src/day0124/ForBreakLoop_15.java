package day0124;



public class ForBreakLoop_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//반복문 앞에 이름을 붙히고 break,continue 등과 사용함으로서
		//둘 이상의 반복문을 건너뛰거나 벗어나는것 가능!!
		
		loop1:for (int i=2;i<=9;i++) 
		{
			for (int j=1;j<=9;j++) 
			{
				if (j==5) 
					break loop1; //name을 줌으로서 먼곳의 반복문도 빠져나갈수있다.
				 System.out.println(i+"*"+j+"="+i*j);
			}
			 System.out.println();
		}//loop1의 끝
			
		
	}

}
