package step02_������;

public class AsciiCode {

	public static void main(String[] args) {
		// ASCII �ڵ� : 7��Ʈ �ڵ� ü��, �̱�������ȯ��ǥ���ڵ�(0~127)
		// A : 65, 100 0001
		// a : 97, 110 0001
		// 1 : 49
		
		System.out.println('A' + " : " + (int)'A'); // A�� int�� ����ȯ
		System.out.println('a' + " : " + (int)'a'); // A�� int�� ����ȯ
		System.out.println(65 + " : " + (char)65); // A�� int�� ����ȯ
		
		// �⺻ �ڷ��� primitive
		// ���� �ڷ��� : byte, char ,int(2^32:43�ﰳ), long
		// �Ǽ� �ڷ��� : float, double
		System.out.println("---------------------------");
		
		System.out.println('A' + 1);
		System.out.println((char)('A' + 1));
		System.out.println('a' - 32);
		System.out.println((char)('A' - 32));
		
		System.out.println('A' + 'B');
	}
}