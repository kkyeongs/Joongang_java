package emp;

import java.util.ArrayList;
import java.util.List;

public class EmpDAO {
	// DAO(data access object) : �����ͺ��̽��� ����(���� �Ǵ� ����)�ϴ� �뵵�� ���
	
	List<EmpVO> list = null;
	
	public EmpDAO() {
		// DB���� ���� ������ �°����� ����
		list = new ArrayList<EmpVO>();
		
		list.add(new EmpVO("kim", "������", 1000000));
		list.add(new EmpVO("lee", "���ߺ�", 1500000));
		list.add(new EmpVO("park", "�ѹ���", 2000000));
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