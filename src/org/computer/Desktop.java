package org.computer;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("Size :250 GB");
	}
	public static void main (String[]args) {
		Desktop info = new Desktop ();
		info.computerModel();
		info.desktopSize();
	}
}
