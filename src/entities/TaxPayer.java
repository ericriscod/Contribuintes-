package entities;

public abstract class TaxPayer {
	
	protected String name;
	protected Double annualRemuneration;
	
	public TaxPayer() {		
	}

	public TaxPayer(String name, Double annualRemuneration) {
		this.name = name;
		this.annualRemuneration = annualRemuneration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnnualRemuneration() {
		return annualRemuneration;
	}

	public void setAnnualRemuneration(Double annualRemuneration) {
		this.annualRemuneration = annualRemuneration;
	}
	
	public abstract double tax();

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name + ": $ " + String.format("%.2f", tax()));
		return sb.toString();
	}
	
	
	

}
