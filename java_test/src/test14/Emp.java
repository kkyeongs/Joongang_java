package test14;

public class Emp {

    public String name;
    public int age;
    public double tall;
    
    public void setEmp(String name, int age, double tall) {
       this.name = name;
       this.age = age;
       this.tall = tall;
    }
    
    public void viewEmp() {
    	System.out.println("���� �̸��� " + name + "�̸�, " 
    					+ age + "���̰� Ű�� " + tall + "cm�Դϴ�");
    }
}