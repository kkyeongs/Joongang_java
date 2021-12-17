package Inputex;

public class InputTest7 {

	public static void main(String[] args) {
		
		// argument를 이용하여 입력 받고 출력
		// $ java InputTest7 103 강호동 C 75.3
		// 출력화면
		// 사원번호 : 103
		// 사원이름 : 강호동
		// 부서코드 : C
		// 입사성적 : 75.3
		// printf를 한 번 사용하여 출력
		
		int eno = Integer.parseInt(args[0]);			
		String ename = args[1];	
		char dept = args[2].charAt(0);		
		double score = Double.parseDouble(args[3]);
		
		System.out.printf("사원번호 : %d\n"
				+ "사원이름 : %s\n"
				+ "부서코드 : %c\n"
				+ "입사성적 : %.1f", eno, ename, dept, score);
	}
}