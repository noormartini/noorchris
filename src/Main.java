import java.io.File;


public class Main {

	public static String file = "Text.txt";

	public static void main(String[] args) {

		File datei = new File(file);
		Operations o = new Operations();
		if (!datei.exists()) {
			o.createConfg();
		} else {
			o.readConf();
		}
	}
}