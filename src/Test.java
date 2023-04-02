import java.io.File;


public class Test {

	public static String file = "Text.txt";

	public static void main(String[] args) {

		File datei = new File(file);
		operations o = new operations();
		if (!datei.exists()) {
			o.createConfg();
		} else {
			o.readConf();
		}
	}
}
