package assignment3;

public class Automation extends MultipleLanguage {

	
	@Override
	public void ruby() {
		System.out.println("ruby");
		
	}
	
public static void main(String[] args) {
		Automation x = new Automation();
		x.Java();
		x.Selenium();
		x.python();
		x.ruby();

	}

}
