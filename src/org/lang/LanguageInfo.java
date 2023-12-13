package org.lang;

public class LanguageInfo extends StateDetails {
	public void tamilLanguage () {
		System.out.println("Tamil - The Ancient Language");
	}
	public void englishLanguage () {
		System.out.println("English - The Global Language");
	}
	public void hindiLanguage() {
		System.out.println("Hindi - The Regional Language");
	}
	public static void main (String[]args) {
		LanguageInfo lang = new LanguageInfo ();
		lang.northIndia();
		lang.southIndia();
		lang.tamilLanguage();
		lang.englishLanguage();
		lang.hindiLanguage();
	}
}
