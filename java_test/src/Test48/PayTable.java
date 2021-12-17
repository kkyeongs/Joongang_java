package Test48;

import java.text.NumberFormat;

public class PayTable extends Salary implements Calculate, Output {


	public PayTable(String name, int pay, int family, int overtime) {
		super(name, pay, family, overtime);
		calc();
		title();
		out();
		footer();
		System.out.println();
	}

	public void out() {
		NumberFormat nf = NumberFormat.getNumberInstance();
		System.out.println(getName() + "\t" + 
							nf.format(getPay()) + "\t" + 
							getFamily() + "\t" + 
							nf.format(getFamily_p()) + "\t" + 
							getOvertime() + "\t" + 
							nf.format(getOvertime_p()) + "\t" + 
							nf.format(getTax()) + "\t" + 
							getIncentive() + "\t\t" + 
							nf.format(getIncen_p()) + "\t" + 
							nf.format(getTotal_pay())
							);
	}

	public void calc() {
		if (getFamily()<3) {
			setFamily_p(getFamily()*20000);
		} else {
			setFamily_p(getFamily()*60000);
		}
		setOvertime_p(getOvertime()*5000);
		setTax(getPay()/10);
		setIncen_p((int) (getPay()*getIncentive()));
		setTotal_pay(getPay()+getFamily_p()+getIncen_p()+getOvertime_p()-getTax());
		setIncentive(getIncentive());
	}

	public void title() {
		System.out.println("                        **** �޿����� ****                        ");
		System.out.println("�̸�\t�⺻��\t������\t��������\t�ð��ܱٹ�\t�ð��ܼ���\t����\t�μ�Ƽ��(%)\t������\t�Ǽ��ɾ�");
		System.out.println("------------------------------------------------------------------------------------------");
	}
	
	public void footer() {
		count=3;
		System.out.println("�ο��� : " + count);
	}
}
