package lab02.main;

import lab02.data.PrintableList;

public class App {

	public static void main(String[] args) {
		PrintableList<String> plist= new PrintableList<> ("Salam", "Hello", "Ciao");
		
		plist.PrintAll();
	}

}
