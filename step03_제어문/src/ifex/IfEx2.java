package ifex;

public class IfEx2 {

	public static void main(String[] args) {
		// ��ø if �� : if�� �ȿ� �� �ٸ� if�� ���
		int age = 35;
		if(age >= 20) {
			if(age < 30) {
				System.out.println("��ſ� �ð� �Ǽ���~");
			} else {
				System.out.println("��������� ������~");
			}
		} else {
			System.out.println("�ֵ��� ����~");
		}
		System.out.println("--------------------------");
	}
}