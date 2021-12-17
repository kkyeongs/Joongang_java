package object;

public class ObjectEx4 {

	public static void main(String[] args) {
		
		Employee em = new Employee();
		em.setEmployee("진달래", "총무부", 2000000, 90.54);
		System.out.println(em.toString());
		
		em.setName("이순신");
		em.setDept("개발부");
		em.setPay(1500000);
		em.setScore(85.75);
		System.out.println(em.toString());
		
		Employee em2 = new Employee();
		em2 = em; // em2 와 em이 같은 공간을 쓴다(가리킨다)
		em2.setEmployee("카카오", "총무부", 2000000, 90.54);
		
		// em2를 바꿨는데 em의 값이 바뀐다, 같은 공간을 쓰기 때문
		System.out.println(em.toString());
	}
}