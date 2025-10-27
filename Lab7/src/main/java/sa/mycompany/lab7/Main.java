package sa.mycompany.lab7;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("nonexistent.txt");
		} catch (FileNotFoundException e) {
			System.out.print("The File Does Not Exist.\n");
			e.printStackTrace();
		}

	}

}
