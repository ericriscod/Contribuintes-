package entities;

public class Individual extends TaxPayer {

	private Double healthExpenditues;

	public Individual() {
		super();
	}

	public Individual(String name, Double annualRemuneration, Double healthSpending) {
		super(name, annualRemuneration);
		this.healthExpenditues = healthSpending;
	}

	public Double getHealthSpending() {
		return healthExpenditues;
	}

	public void setHealthSpending(Double healthExpenditues) {
		this.healthExpenditues = healthExpenditues;
	}

	@Override
	public double tax() {
		double tax = 0;
		if (annualRemuneration < 20000.00) {
			tax = (annualRemuneration * 0.15) - (healthExpenditues * 0.50);
		} else if (annualRemuneration >= 20000.0) {
			tax = (annualRemuneration * 0.25) - (healthExpenditues * 0.50);
		}

		return tax;
	}

}
