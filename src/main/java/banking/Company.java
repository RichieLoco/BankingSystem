package banking;

public class Company extends AccountHolder {
	private String companyName;
	private int taxId;

	public Company(String companyName, int taxId) {
		super(taxId);
		this.companyName = companyName;
		this.taxId = taxId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public int getTaxId() {
		return taxId;
	}

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
