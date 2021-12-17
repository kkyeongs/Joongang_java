package stringex;

public class StringBufferEx {

	public static void main(String[] args) {
		
		String buf = "aaa";
		buf += "123";
		buf += "가나다";
		buf += "\n";
		buf += "가나다";
		
		System.out.println(buf);
		System.out.println("-------------------------");
		
		StringBuffer st = new StringBuffer();
		st.append("bbb");
		st.append("456");
		st.append("라마바");
		st.append("라마바");
		System.out.println(st);
		System.out.println(st.capacity());	// 16출력, 용량
		System.out.println(st.length());	// 12출력, 열
		
		st.delete(3, 6);	// 3에서 5까지 공간에서 아예 삭제
		System.out.println(st); 
		System.out.println(st.capacity());
		
		st.reverse();		// 거꾸로?..
		System.out.println(st.capacity());
		
		st.trimToSize();	// 삭제된 공간을 비워주는? .delete하고 남아있는 공간을 없애줌
		System.out.println(st.capacity());
	}
}