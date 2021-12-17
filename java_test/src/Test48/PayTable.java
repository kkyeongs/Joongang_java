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
		System.out.println("                        **** 급여명세서 ****                        ");
		System.out.println("이름\t기본급\t가족수\t가족수당\t시간외근무\t시간외수당\t세금\t인센티브(%)\t성과금\t실수령액");
		System.out.println("------------------------------------------------------------------------------------------");
	}
	
	public void footer() {
		count=3;
		System.out.println("인원수 : " + count);
	}
}
