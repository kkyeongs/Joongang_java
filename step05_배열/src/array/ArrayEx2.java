package array;

public class ArrayEx2 {

	public static void main(String[] args) {
		
		// 1���� �迭
		String[] car = {"�Ÿ", "Ƽ��", "����ũ", "������", "������"};
		car[3] = "�׷���";
		
		for (String st : car) 
			System.out.println(st);
		
		// car ������ �����͸� for�� �̿��Ͽ� �������� ���
		for (int i = car.length-1; i >= 0; i--) {
			System.out.println(car[i]);
		}
	}
}