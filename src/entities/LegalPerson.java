package entities;

public class LegalPerson extends TaxPayer {

	// Attributes
	private Integer numberOfEmployees;

	// Builders
	public LegalPerson() {
		super();
	}

	public LegalPerson(String name, Double annualIncome, Integer numberOfEmployees) {
		super(name, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	// Accessor Methods
	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	// Methods
	@Override
	public Double calculateTax() {
		if (getNumberOfEmployees() > 10) {
			double fee = 0.14;
			return getAnnualIncome() * fee;
		} else {
			double fee = 0.16;
			return getAnnualIncome() * fee;
		}
	}

}
