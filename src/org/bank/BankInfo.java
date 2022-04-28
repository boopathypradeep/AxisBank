package org.bank;

public class BankInfo extends AxisBank {
	private void savings() {
		System.out.println("savings:7468876554");

	}
	private void fixed() {
		System.out.println("fixed:8574736644744");
	}
	public static void main(String[] args) {
		BankInfo b=new BankInfo();
		b.savings();
		b.fixed();
		b.deposit();
	}

}
