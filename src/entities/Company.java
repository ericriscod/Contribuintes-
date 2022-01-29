package entities;

public class Company extends TaxPayer {

	private Integer numberOfEmployees;

	public Company() {
		super();
	}

	public Company(String name, Double annualRemuneration, Integer numberOfEmployees) {
		super(name, annualRemuneration);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		double tax = annualRemuneration*.16;
		if (numberOfEmployees >= 10) {
			tax = annualRemuneration*0.14;
		}
		return tax;
	}

}
