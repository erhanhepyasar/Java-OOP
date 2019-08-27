package oop5abstraction.abstractclasses;

public class Contractor extends Employee {
	private int workingHours;

	public Contractor(String name, int paymentPerHour, int workingHours) {
		super(name, paymentPerHour);
		this.workingHours = workingHours;
	}

	// have to provide it’s own implementation of calculateSalary() method
	@Override
	public int calculateSalary() {
		return getPaymentPerHour() * workingHours;
	}

}
