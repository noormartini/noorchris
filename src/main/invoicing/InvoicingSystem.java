package invoicing;

public class InvoicingSystem {
	ConfigInterface configInterface;
	ConfigRepository configRepo;
	private String name = "", adresse = "", bank = "";

	InvoicingSystem(ConfigInterface configInterface, ConfigRepository configRepo) {
		this.configInterface = configInterface;
		this.configRepo = configRepo;
	}

	public void runOperations() {
		if (!configRepo.configurationExists()) {
			createConfg();
		} else {
			readConf();
		}
	}
	
	private void createConfg() {
		name = configInterface.readCompanyName();
		adresse = configInterface.readAddress();
		bank = configInterface.readBankverbindung();
		configRepo.beginSave();
		configRepo.saveCompanyName(name);
		configRepo.saveAddress(adresse);
		configRepo.saveBankeverbindung(bank);
		configRepo.endSave();
		updateData();
	}

	private void readConf() {
		configRepo.beginRead();
		name = configRepo.getCompanyName();
		adresse = configRepo.getAddress();
		bank = configRepo.getBankverbindung();
		configRepo.endRead();
		updateData();
	}
	
	private void updateData() {
		configInterface.updateCompanyName(name);
		configInterface.updateAddress(adresse);
		configInterface.updateBankverbindung(bank);
	}
}
