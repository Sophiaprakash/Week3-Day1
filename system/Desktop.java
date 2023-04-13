package org.system;


public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("Desktop size is 21 inch");
	}
	

	public static void main(String[] args) {
		Desktop x = new Desktop();
		x.computerModel();
		x.desktopSize();
	}


}
