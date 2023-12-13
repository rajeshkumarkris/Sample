package org.lang;

public class StateDetails {
	public void southIndia() {
		System.out.println("Majority of the people can able to speak English");
	}
	public void northIndia () {
		System.out.println("Majority of the people can speak Hindi");
	}

	public static void main (String [] args) {
		LanguageInfo lang = new LanguageInfo ();
		lang.tamilLanguage();
		lang.englishLanguage();
		lang.hindiLanguage();
		
		StateDetails state = new StateDetails();
		state.southIndia();
		state.northIndia();
	}


}
