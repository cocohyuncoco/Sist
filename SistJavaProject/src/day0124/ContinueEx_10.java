package day0124;



public class ContinueEx_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//12457810 을 continue 문을 포함해서 출력해 보세요
		//break문과 차이점은 반복문을 벗어나지 않는다 는점
		//continue 이후의 문장은 수행되지 않는점
		
		for (int i=1;i<=10;i++) 
			{if (i%3==0) 
				continue; //i++로 이동
				System.out.print(i+" ");
			}
			
			System.out.println();
			
			//continue 이용할것!!
			//홀수값:1
			//홀수값:3
			//홀수값:5
			//홀수값:7
			//홀수값:9
			for (int i=1;i<=10;i++) 
				{
				if (i%2==0) //짝수를 의미
					continue; //반복문 으로 이동..i++
					System.out.println("홀수값: "+i);
					
				}
		
	}
}


