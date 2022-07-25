package day0124;

public class WhileTrueCnt_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1~100까지의 숫자중에서 3의 배수는 총 몇개가 있는지 갯수를 구하시오
		 * while(true)로 구할것
		 * 
		 * 3의 배수갯수:33개
		 */
		
		int n=0; //반복증가할 수
		int cnt=0; //개수
		
		while (true) {
			n++; 
			//3의 배수이면 cnt변수 1증가
			if (n%3==0) 
				cnt++;
				//break문..n이 100이면 while문 종료
				if (n==100) 
					break;
			System.out.println("3의 배수갯수:"+cnt+"개");
		}
	}

}
