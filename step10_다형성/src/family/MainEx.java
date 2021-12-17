package family;

public class MainEx {

	public static void main(String[] args) {
		
		Family fm1 = new Father("홍길동");
		System.out.println(fm1.toString());
		
		Family fm2 = new Mother("고두심");
		System.out.println(fm2.toString());
		
		Family fm3 = new Son("홍준표");
		System.out.println(fm3.toString());
		
		String com = args[0];	// 입력받는거... 이걸 com으로 만들고
		Family fm = null;		// 상위 클래스를 fm으로 만들고 null값 준 다음 if로 판별하기
		if (com.equals("홍길동")) {
			fm = new Father();
			System.out.println(fm.toString());
		} else if (com.equals("고두심")) {
			fm = new Mother();
			System.out.println(fm.toString());
		} else if (com.equals("홍준표")) {
			fm = new Son();
			System.out.println(fm.toString());
		} else {
			System.out.println("에러발생~~");
		}
		System.out.println("----------------------------");
		
		Family[] family = new Family[] {
			new Father("홍길동"), new Mother("고두심"), new Son("홍준표")
		};
		for (Family ob : family) {
			System.out.println(ob);
		}
	}
}