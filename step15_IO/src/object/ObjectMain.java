package object;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectMain {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
//		객체 직렬화
//		UserInfo ob1=new UserInfo("민들래", 20, 89.5);
//		UserInfo ob2=new UserInfo("진달래", 22, 73.4);
//		
//		ObjectOutputStream oos;
//		oos=new ObjectOutputStream(new FileOutputStream("storage/user.txt", true)); --true=업핸드처리
//		
//		oos.writeObject(ob1);
//		oos.writeObject(ob2);
//		oos.close();
//		
//		System.out.println("객체가 저장되었습니다");
		
		
//		객체 역직렬화
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("storage/user.txt"));
		
		UserInfo ui1=(UserInfo)ois.readObject();
		UserInfo ui2=(UserInfo)ois.readObject();
		
		ui1.dsip();
		ui2.dsip();
		ois.close();
	}
}
















