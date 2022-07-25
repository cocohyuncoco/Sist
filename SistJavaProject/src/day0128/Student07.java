package day0128;

public class Student07 {

	private String name; //null
	private int age; //0
	//생성자(명시적 생성자)
	public Student07(String name,int age) {
		this.name=name;
		this.age=age;
	}
	//디폴트 생성자
	public Student07() {

	}
	//setter메서드
	//인스턴스 변수에 저장된 데이터를 수정할 목적으로 사용 -set변수명
	//저장용이므로 결과값이 없다 void

	public void setName(String name) {
		this.name=name;
	}

	public void setAge(int age) {
		this.age=age;
	}
	//getter 메서드
	//인스턴스 변수에 저장된 데이터를 조회할 목적으로 사용 _get변수명
	//데이터 얻는목적,호출데이터를 넘겨주는 데이터가 없으므로 인자 없음()
	//실행결과값을 돌려주므로 'retrun결과값' 으로 지정
	//리턴타입도 결과값 타입으로 지정한다

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}




}

