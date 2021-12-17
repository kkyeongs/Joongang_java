package constructor;

public class ConstructorEx6 {

	public static void main(String[] args) {
		
		Student st = new Student();
		st.setName("홍길동");
		st.setKor(95);
		st.setEng(85);
		st.setMat(73);
		
		System.out.println(st.toString());
		
		// 매개변수 4개 생성자를 이용하여 값을 대입하고 (민들레, 95, 85, 73)
		// getter를 이용하여 출력
		
		st = new Student("민들레", 95, 85, 73);
		System.out.println("이름 : " + st.getName());
		System.out.println("국어 : " + st.getKor());
		System.out.println("영어 : " + st.getEng());
		System.out.println("수학 : " + st.getMat());
		System.out.println("평균 : " + st.getAvg());
		System.out.println("학점 : " + st.getGrade());
	}
}