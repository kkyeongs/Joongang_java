package Test31;

public class Test31 {

	public static void main(String[] args) {
	
		String[] color = {"red", "green", "blue", "yellow", "pink"};
		for (int i = 0; i < color.length; i++) {
			System.out.println(color[i] + "는(은) " + color[i].length() + "글자 입니다");
		}
	}
}