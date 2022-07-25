package day0121;

import java.util.Scanner;

public class SwitchsScoreEx_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int score;
		String grade;
		
		System.out.println("당신의 점수는?");
		score = sc.nextInt();
		System.out.println("당신의 점수는 "+score+"입니다");
		//switch
		switch (score/10) {
		case 10:case 9:
			grade="A";
			break;
		case 8:
			grade="B";
			break;
		case 7:
			grade="C";
			break;
		case 6:
			grade="D";
			break;
		default:
			grade="F";
			break;
		}
		
		System.out.println("당신의 점수는 "+score+"입니다. 학점은 "+grade+"입니다.");
		
		//삼항연산자로 평가메세지
		
		String msg;
		msg = score>=90?"합격입니다":
				score>=80?"좀 더 노력하세요":"다음 기회에...재시험";
				
		System.out.println(msg);		
	}

}
