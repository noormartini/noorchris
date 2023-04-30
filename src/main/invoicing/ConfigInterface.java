package invoicing;

public interface ConfigInterface {
	public String readCompanyName();
	public String readAddress();
	public String readBankverbindung();
	public void updateCompanyName(String companyName);
	public void updateAddress(String adress);
	public void updateBankverbindung(String bank);
}
