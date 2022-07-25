package day0124;

public class ForSumEx_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1부터 100까지의 숫자중에서 짝수의 합과 홀수의 합을 각각 출력하시오
		//짝수의 합:**
		//홀수의 합:**
		
		int esum=0; //짝수 합을 구할 변수
		int osum=0; //홀수 합을 구할 변수
		
		for (int i=1;i<=100;i++) {
			if (i%2==0) 
				esum+=i;
			else
				osum+=i;
		}
		System.out.println("짝수의 합:"+esum);
		System.out.print("홀수의 합:"+osum);
	}

}
