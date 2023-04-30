package invoicing;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

import org.junit.jupiter.api.Test;


class OperationsTest {
	public static final String fileName = "test_configuration.txt";
	
	@Test
	void testReadCompanyName() {
		File tempfile = new File(fileName);
		try {
			MockConfigReader mockConfigReader = new MockConfigReader();
			InvoicingSystem operations = new InvoicingSystem(mockConfigReader);
			
			
			FileWriter testFileWriter = new FileWriter(tempfile);
			BufferedWriter testBuffer = new BufferedWriter(testFileWriter);
			
			FileReader fileReader = new FileReader(tempfile);
			BufferedReader testReader = new BufferedReader(fileReader);
			
			operations.readCompanyName(testBuffer);
			testBuffer.close();
			
			String companyName = testReader.readLine();
			assertEquals("Firmenname: " + '"' + mockConfigReader.readCompanyName() + '"', companyName);
		} catch (IOException err) {
			fail("File could not be read.");
		}
	}
}
