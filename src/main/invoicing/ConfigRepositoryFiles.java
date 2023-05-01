package invoicing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class ConfigRepositoryFiles implements ConfigRepository {
	String file = "Text.txt";
	File tempfile = new File(file);
	char quotationMarks = '"';
	FileWriter anlegen;
	BufferedWriter schreiben;
	FileReader reading;
	BufferedReader lesen;
	
	@Override
	public void beginSave() {
		try {
			this.anlegen = new FileWriter(tempfile);
			this.schreiben = new BufferedWriter(anlegen);
		} catch (IOException err) {
			
		}
	}
	
	@Override
	public void saveCompanyName(String companyName) {
		try {
			schreiben.write("Firmenname: " + quotationMarks + companyName + quotationMarks + "\n");
		} catch (IOException err) {
			
		}
	}

	@Override
	public void saveAddress(String address) {
		try {
			schreiben.write("Adresse: " + quotationMarks + address + quotationMarks + "\n");
		} catch (IOException err) {
			
		}
	}

	@Override
	public void saveBankeverbindung(String bankVerbindung) {
		try {
			schreiben.write("Bankverbindung: " + quotationMarks + bankVerbindung + quotationMarks + "\n");
		} catch (IOException err) {
			
		}
	}
	
	@Override
	public void endSave() {
		// TODO Auto-generated method stub
		try {
			this.schreiben.close();
		} catch (IOException err) {
			
		}
	}
	
	@Override
	public void beginRead() {
		// TODO Auto-generated method stub
		try {
			this.reading = new FileReader(file);
			this.lesen = new BufferedReader(reading);
		} catch(IOException err) {
			
		}
	}

	@Override
	public String getCompanyName() {
		try {
			return lesen.readLine();
		} catch(IOException err) {
			return null;
		}
	}

	@Override
	public String getAddress() {
		try {
			return lesen.readLine();
		} catch(IOException err) {
			return null;
		}
	}

	@Override
	public String getBankverbindung() {
		try {
			return lesen.readLine();
		} catch(IOException err) {
			return null;
		}
	}

	@Override
	public void endRead() {
		try {
			lesen.close();
		} catch(IOException err) {
			
		}
	}

	@Override
	public boolean configurationExists() {
		// TODO Auto-generated method stub
		return tempfile.exists();
	}
}


