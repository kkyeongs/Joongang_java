package object;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectMain {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
//		��ü ����ȭ
//		UserInfo ob1=new UserInfo("�ε鷡", 20, 89.5);
//		UserInfo ob2=new UserInfo("���޷�", 22, 73.4);
//		
//		ObjectOutputStream oos;
//		oos=new ObjectOutputStream(new FileOutputStream("storage/user.txt", true)); --true=���ڵ�ó��
//		
//		oos.writeObject(ob1);
//		oos.writeObject(ob2);
//		oos.close();
//		
//		System.out.println("��ü�� ����Ǿ����ϴ�");
		
		
//		��ü ������ȭ
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("storage/user.txt"));
		
		UserInfo ui1=(UserInfo)ois.readObject();
		UserInfo ui2=(UserInfo)ois.readObject();
		
		ui1.dsip();
		ui2.dsip();
		ois.close();
	}
}
















