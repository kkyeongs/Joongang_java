package array;

public class ArrayEx3 {

	public static void main(String[] args) {
		
		System.out.println("args�� ���� : " + args.length);
		
		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "] : " +  args[i]);
			System.out.println("args[" + i + "]�� ũ�� : " +  args[i].length());
		}
		System.out.println("------------------------------");
		
		for(String data : args) {
			System.out.println(data);
			System.out.println(data.length() + "\n");
		}
	}
}