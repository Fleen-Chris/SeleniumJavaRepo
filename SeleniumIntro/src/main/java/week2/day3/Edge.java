package week2.day3;

public class Edge extends Chrome {

	public void takeSnap() {

		System.out.println("Please take Snap.");
	}

	public void clearCoockies() {

		System.out.println("Please clear Coockies.");
	}

	public void clearCache() {

		System.out.println("Please clear Cache.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Edge ed = new Edge();

		ed.browserName = "Edge";
		
		System.out.println(ed.browserName);

		ed.browserVersion = "133.0.3065.82";
		
		System.out.println(ed.browserVersion);

		ed.closeBrowser();

		ed.navigateBack();

		ed.openURL();

		ed.openIncognito();

		ed.clearCache();

		ed.takeSnap();

		ed.clearCoockies();

	}

}
