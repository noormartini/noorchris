package invoicing;

public class Main {
	public static void main(String[] args) {
		ConfigCLI readerScanner = new ConfigCLI();
		ConfigRepositoryFiles configRepo = new ConfigRepositoryFiles();
		InvoicingSystem invoicingSystem = new InvoicingSystem(readerScanner, configRepo);
		invoicingSystem.runOperations();
	}
}