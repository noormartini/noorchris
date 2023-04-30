package invoicing;

public class MockConfigReader implements ConfigInterface {

	@Override
	public String readCompanyName() {
		return "Mycompany";
	}

	@Override
	public String readAddress() {
		return "MyAddress";
	}

	@Override
	public String readBankverbindung() {
		return "MyBankVerbindung";
	}
}
