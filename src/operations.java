
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class operations {

	String file = "Text.txt";
	Scanner sc = new Scanner(System.in);
	File tempfile = new File(file);

	public void createConfg() {

		try {
			FileWriter anlegen = new FileWriter(tempfile);
			BufferedWriter schreiben = new BufferedWriter(anlegen);

			char c = '"';

			System.out.println("geben sie name an");
			String name = sc.next();
			schreiben.write("Firmenname: " + c + name + c + "\n");

			System.out.println("geben sie adresse an");
			String adresse = sc.next();
			schreiben.write("Adresse: " + c + adresse + c + "\n");

			System.out.println("geben sie bank daten an");
			String bank = sc.next();
			schreiben.write("Bankverbindung: " + c + bank + c + "\n");

			schreiben.close();

		}

		catch (IOException e) {
		}
	}

	public void readConf() {
		try {
			FileReader reading = new FileReader(file);
			BufferedReader lesen = new BufferedReader(reading);

			String zeile = lesen.readLine();
			while (zeile != null) {
				System.out.println(zeile);
				zeile = lesen.readLine();
			}
			lesen.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
