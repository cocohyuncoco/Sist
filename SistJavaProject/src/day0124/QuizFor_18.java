package day0124;

public class QuizFor_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/*
		 * 1. Happy
		 *  	1: Java 2:Java 3:Java 4:Java
		 *  
		 * 2. Happy
		 *  	1: Java 2:Java 3:Java 4:Java
		 * 
		 * 3. Happy
		 *  	1: Java 2:Java 3:Java 4:Java
		 *  
		 */
		
			for (int i =1;i<=3;i++) {
				System.out.println(i+":Happy");		
				for (int j=1;j<=4;j++) {
					System.out.print("\t"+j+":Java");		
				}
				System.out.println();
			}
		
	}
	
}
