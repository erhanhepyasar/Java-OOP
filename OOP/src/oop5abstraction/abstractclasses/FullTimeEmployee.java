package oop5abstraction.abstractclasses;

public class FullTimeEmployee extends Employee {

	public FullTimeEmployee(String name, int paymentPerHour) {
		super(name, paymentPerHour);
	}

	// have to provide it’s own implementation of calculateSalary() method
	@Override
	public int calculateSalary() {
		return getPaymentPerHour() * 8;
	}

}
