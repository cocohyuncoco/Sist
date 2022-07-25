package mycar.data;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Entity
@Table(name = "mycar")
@Data
public class MycarDto {
	
	
	@Id //시퀀스	
	@GeneratedValue(strategy = GenerationType.AUTO) //자동증가하는 num값 이란뜻..
	private long num;
	
	//컬럼이랑 이름이 다르면 name을 주고 같으면 줄 필요없다..이건 예제로 써본거, 사실 name따로 줄 필요없음
	@Column(name = "carname")
	private String carname;
	
	@Column
	private int price;
	
	@Column
	private String carcolor;
	
	@Column
	private String carguip;	

	@CreationTimestamp	//엔티티 생성되는 시점 시간 자동등록
	@Column(updatable = false)	//수정시 이 컬럼은 수정하지 않겠단 뜻
	private Timestamp guipday;	
	
}
