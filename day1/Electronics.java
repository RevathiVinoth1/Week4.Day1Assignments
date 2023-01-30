package week4.day1;

public class Electronics extends TeleVision implements Mobile,Laptop{

	public void windows() {
		System.out.println("I have Installed Windows 11 in My Laptop");
		
	}

	public void version() {
		System.out.println("I have Bought a Latest Version of Android Mobile ");
		
	}

	@Override
	public void brand() {
		System.out.println("The OnePlus Company have Decided to Introduce a New Brand of TeleVision");
		
	}
	public static void main(String[] args) {
		Electronics elect=new Electronics();
		elect.android();
		elect.brand();
		elect.version();
		elect.windows();
	}

}
