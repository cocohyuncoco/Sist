package mycar.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/*방법1. CrudRepository의 상속을 받아도되고 
<T, ID> dto랑 id엔 타입
public interface MycarInter extends CrudRepository<MycarDto, Long>{
	
}
*/

//방법2 JpaRepository
//MyCarinter를 implement받는 dao를 만들예정
public interface MycarInter extends JpaRepository<MycarDto, Long>{
	
}

