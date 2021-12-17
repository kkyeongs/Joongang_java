package family;

public class MainEx {

	public static void main(String[] args) {
		
		Family fm1 = new Father("ȫ�浿");
		System.out.println(fm1.toString());
		
		Family fm2 = new Mother("��ν�");
		System.out.println(fm2.toString());
		
		Family fm3 = new Son("ȫ��ǥ");
		System.out.println(fm3.toString());
		
		String com = args[0];	// �Է¹޴°�... �̰� com���� �����
		Family fm = null;		// ���� Ŭ������ fm���� ����� null�� �� ���� if�� �Ǻ��ϱ�
		if (com.equals("ȫ�浿")) {
			fm = new Father();
			System.out.println(fm.toString());
		} else if (com.equals("��ν�")) {
			fm = new Mother();
			System.out.println(fm.toString());
		} else if (com.equals("ȫ��ǥ")) {
			fm = new Son();
			System.out.println(fm.toString());
		} else {
			System.out.println("�����߻�~~");
		}
		System.out.println("----------------------------");
		
		Family[] family = new Family[] {
			new Father("ȫ�浿"), new Mother("��ν�"), new Son("ȫ��ǥ")
		};
		for (Family ob : family) {
			System.out.println(ob);
		}
	}
}