package Test21;

public class EmpEx {

	public static void main(String[] args) {
		Emp ex21 = new Emp();
		ex21.setName("강호동");
		ex21.setDept("영업부");
		ex21.setSalary(1200000);
		System.out.println(ex21.toString());
		
		System.out.println("이름 : " + ex21.getName());
		System.out.println("부서 : " + ex21.getDept());
		System.out.println("급여 : " + ex21.getSalary());
	}
}