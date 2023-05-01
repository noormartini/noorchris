package invoicing;

import java.util.Scanner;

public class ConfigCLI implements ConfigInterface {
	private Scanner sc = new Scanner(System.in);
	
	@Override
	public String readCompanyName() {
		System.out.println("geben sie name an");
		return sc.nextLine();
	}

	@Override
	public String readAddress() {
		System.out.println("geben sie adresse an");
		return sc.nextLine();
	}

	@Override
	public String readBankverbindung() {
		System.out.println("geben sie bank daten an");
		return sc.nextLine();
	}

	@Override
	public void updateCompanyName(String companyName) {
		System.out.println(companyName);
	}

	@Override
	public void updateAddress(String adress) {
		System.out.println(adress);
	}

	@Override
	public void updateBankverbindung(String bank) {
		System.out.println(bank);
	}
	
}
