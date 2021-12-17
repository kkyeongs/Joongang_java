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
    	System.out.println("나의 이름은 " + name + "이며, " 
    					+ age + "살이고 키는 " + tall + "cm입니다");
    }
}