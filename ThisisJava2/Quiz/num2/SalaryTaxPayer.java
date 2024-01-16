package Quiz.num2;

//실습과제 11.1: SalaryTaxPayer.java
//근로소득자를 모델한다

public class SalaryTaxPayer extends TaxPayer
{
	private int salary;		// 월급
	private double tax;
	// 근로소득자의 이름, 번호와 월급을 주어진 값으로 초기화한다
	public SalaryTaxPayer(String name, int number, int salary){
		super(name,number);
		this.salary = salary;
	}

	// 근로소득자의 월급을 반환한다
     // 여기에 메소드를 입력하세요
	public int getSalary() {return salary;}
	// 근로소득자의 이름, 번호와 월급을 반환한다
	public String toString(){
		return super.nameNumber()+", 월급: "+salary;
	}

	// 근로소득자의 월급을 주어진 값으로 변경한다
     // 여기에 메소드를 입력하세요
	public void setSalary(int salary) {this.salary = salary;}

	// 근로소득자의 세금을 계산한다
	public double computeTax()	{
		if(salary*12>=80000000) {
			tax = (salary*12)*0.3;
		}else if(salary*12 >=60000000) {
			tax = salary*12*0.2;
		}else if((salary*12)>=40000000) {
			tax = (salary*12)*0.15;
		}else if((salary*12)>=20000000){
			tax = (salary*12)*0.1;
		}else {
			tax = (salary*12)*0.05;
		}
		return tax;
	}
}
