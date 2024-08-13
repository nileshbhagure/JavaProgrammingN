package javasessions.constructor;

public class ApplicationSystem {
//WAP to return design pages by calling from another class	
	String name;
	String url;
	int pages;
	
	
  //creating parametrised const
	public ApplicationSystem(String name, String url, int pages) {
		this.name = name;
		this.url = url;
		this.pages = pages;
	}

	public int getPageCount(String appName) {
		switch (appName) {
		case "amazon":
			return pages;

		case "flipkart":
			return pages;

		case "mantra":
			return pages;

		default:
			System.out.println("app not found");
			return -1;

		}
	}

}
