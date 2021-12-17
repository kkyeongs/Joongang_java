package emp;

import java.util.ArrayList;
import java.util.List;

public class EmpDAO {
	// DAO(data access object) : 데이터베이스에 접근(저장 또는 추출)하는 용도로 사용
	
	List<EmpVO> list = null;
	
	public EmpDAO() {
		// DB에서 값을 가지고 온것으로 가정
		list = new ArrayList<EmpVO>();
		
		list.add(new EmpVO("kim", "영업부", 1000000));
		list.add(new EmpVO("lee", "개발부", 1500000));
		list.add(new EmpVO("park", "총무부", 2000000));
	}

	public List<EmpVO> getEmpList() {
		return list;
	}

	public EmpVO getEMP(String name) {
		for (EmpVO vo : list) {
			if(vo.getName().equals(name)) {
				return vo;
			}
		}
		return null;
	}
}