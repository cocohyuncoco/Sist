package day0217;

import java.io.Serializable;

public class _07_Shop implements Serializable{
	
	private String sang;
	private int su;
	private int dan;
	
	public _07_Shop() {
		// TODO Auto-generated constructor stub
	}

	public _07_Shop(String sang, int su, int dan) {
		// TODO Auto-generated constructor stub
		this.sang=sang;
		this.su=su;
		this.dan=dan;
	}

	//setter, getter
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
	
	

}
