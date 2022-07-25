package day0210;

public class Shop {

	private String sang;
	private int su;
	private int dan;
	
	
	
	
	public String getSang() {
		return sang;
	}
	public void setSang(String sang) {
		this.sang = sang;
	}
	public int getSu() {
		return su;
	}
	public void setSu(int su) {
		this.su = su;
	}
	public int getDan() {
		return dan;
	}
	public void setDan(int dan) {
		this.dan = dan;
	}
	
	//รัพื
	public int getTot() {
		int s = this.su*this.dan;
		return s;
	}
	
	
}
