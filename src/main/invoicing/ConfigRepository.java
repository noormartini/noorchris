package invoicing;

public interface ConfigRepository {
	public boolean configurationExists();
	public void beginSave();
	public void saveCompanyName(String companyName);
	public void saveAddress(String address);
	public void saveBankeverbindung(String bankVerbindung);
	public void endSave();
	public void beginRead();
	public String getCompanyName();
	public String getAddress();
	public String getBankverbindung();
	public void endRead();
}
