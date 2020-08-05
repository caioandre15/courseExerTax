package entities;

public abstract class TaxPayer {

	// Attributes
	private String name;
	private Double annualIncome;

	// Builders
	public TaxPayer() {
	}

	public TaxPayer(String name, Double annualIncome) {
		this.name = name;
		this.annualIncome = annualIncome;
	}

	// Accessor Methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(Double annualIncome) {
		this.annualIncome = annualIncome;
	}

	// Methods
	public abstract Double calculateTax();

}
