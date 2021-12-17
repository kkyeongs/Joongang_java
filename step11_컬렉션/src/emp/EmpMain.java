package emp;

import java.util.List;
import java.util.Scanner;

public class EmpMain {

	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		System.out.println("*** 모든 사원 출력하기 ***");
		
		List<EmpVO> list = dao.getEmpList();	// 다오가 가진 사원 정보 리턴 함수
												// dao의 list가 리턴돼서 오는데 이걸 쓰기 위해서는
												// list를 만들어줘야한다
		
		for (EmpVO vo : list) {
			System.out.println("이름 : " + vo.getName());
			System.out.println("부서 : " + vo.getDept());
			System.out.println("급여 : " + vo.getSalary() + "\n");
		}
		System.out.println("------------------------------------");
		
		System.out.println("*** 검색 사원 출력하기 ***");
		System.out.print("검색할 사원 이름 : ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		EmpVO em = dao.getEMP(name);
		if (em == null) {
			System.out.println("찾는 사람이 없다");
		} else {
			System.out.println("이름 : " + em.getName());
			System.out.println("부서 : " + em.getDept());
			System.out.println("급여 : " + em.getSalary() + "\n");
		}
	}
}