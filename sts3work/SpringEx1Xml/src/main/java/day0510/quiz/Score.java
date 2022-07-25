package day0510.quiz;

public class Score {
	
	private int kor;
	private int eng;
	private int mat;
	
	public Score(int kor, int eng, int mat) {
		// TODO Auto-generated constructor stub
		this.eng=eng;
		this.kor=kor;
		this.mat=mat;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}
	
	
}
