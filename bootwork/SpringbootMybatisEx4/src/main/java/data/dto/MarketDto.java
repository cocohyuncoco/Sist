package data.dto;

import java.sql.Timestamp;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("mdto")
public class MarketDto {

	private String num;
	private String sang;
	private int dan;
	private String photoname;
	private Timestamp ipgo;
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getSang() {
		return sang;
	}
	public void setSang(String sang) {
		this.sang = sang;
	}
	public int getDan() {
		return dan;
	}
	public void setDan(int dan) {
		this.dan = dan;
	}
	public String getPhotoname() {
		return photoname;
	}
	public void setPhotoname(String photoname) {
		this.photoname = photoname;
	}
	public Timestamp getIpgo() {
		return ipgo;
	}
	public void setIpgo(Timestamp ipgo) {
		this.ipgo = ipgo;
	}
	
}

