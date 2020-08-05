package entities;

public class PhysicalPerson extends TaxPayer {

	// Attributes
	private Double healthSpending;

	// Builders
	public PhysicalPerson() {
		super();
	}

	public PhysicalPerson(String name, Double annualIncome, Double healthSpending) {
		super(name, annualIncome);
		this.healthSpending = healthSpending;
	}

	// Accessor Methods
	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	// Methods
	@Override
	public Double calculateTax() {
		if (getAnnualIncome() < 20000.00) {
			double fee = 0.15;
			return getAnnualIncome() * fee - healthSpending * 0.50;
		} else {
			double fee = 0.25;
			return getAnnualIncome() * fee - healthSpending * 0.50;
		}

	}

}
