package Test21;

public class EmpEx {

	public static void main(String[] args) {
		Emp ex21 = new Emp();
		ex21.setName("��ȣ��");
		ex21.setDept("������");
		ex21.setSalary(1200000);
		System.out.println(ex21.toString());
		
		System.out.println("�̸� : " + ex21.getName());
		System.out.println("�μ� : " + ex21.getDept());
		System.out.println("�޿� : " + ex21.getSalary());
	}
}