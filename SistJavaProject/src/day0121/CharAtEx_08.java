package day0121;

public class CharAtEx_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String jumin = "951102-2276545";
		
		//index 순서는 0번부터
		
		
		char seventh = jumin.charAt(7);
		
		//조건문을 이용하여 남자, 여자, 2000년 이후 남자, 여자 인지 구하시오
		if (seventh=='1') 
			System.out.println("당신은 남자");
		else if(seventh=='2') 
			System.out.println("당신은 여자");
		else if(seventh=='3') 
			System.out.println("당신은 2000년 이 후 남자");
		else if(seventh=='4')
			System.out.println("당신은 2000년 이 후 여자");
		else
			System.out.println("오류");
		
			
	
	}

}
