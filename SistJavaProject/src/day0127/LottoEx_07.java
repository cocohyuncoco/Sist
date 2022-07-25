package day0127;



public class LottoEx_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//똑같은 수 가 있으면 빼줄려는 중복체크
		//i보다 작게 
		//비교를 한다는건 다 중첩함수를 쓴다는거다
		
		//로또를 출력해보자. 중복된 번호 없어야하고 오름차순 정렬되어 있어야 한다
		int[] lotto=new int[6];
		
		//임의의수를 로또변수에 발생시켜서 넣어준다 (1~47)
		
		for (int i=0;i<lotto.length;i++) 
		{
			lotto[i]=(int)(Math.random()*45)+1; //1~45사이 랜덤수
			//System.out.println("뽑은값:"+lotto[i]);

			//중복처리 
			//중복제거: 현재 index(i)와 (0~i-1) 비교해서 중복된 숫자 존재시 i--
			for (int j=0;j<i;j++) 
			{
				//System.out.println(lotto[i]+"=="+lotto[j]);
				//조건문
				if (lotto[i]==lotto[j]) 
				{
					//System.out.println("중복");
					i--; //같은번지에 다시 값을 구하기 위해서
					break; //i++로 이동
				}
			}
		}
		//오름차순 정렬
		//Arrays.sort(lotto);
		for (int i=0;i<lotto.length-1;i++) 
		{
			for (int j=i+1;j<lotto.length;j++) 
			{
				if (lotto[i]>lotto[j]) 
				{
					int temp=lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=temp;
				}
				
			}
			
		}
		
		
		//출력
		for (int i=0;i<lotto.length;i++) 
		{
			//System.out.printf("%5d",lotto[i]);
			System.out.print(lotto[i]+"\t");
			
		}
		

	}

}
