package oop_encapsulation;

import java.util.ArrayList;

public class BrowserSession {
	private String name;
	private int version;
	private ArrayList<String> pluginList;

	public BrowserSession(String name, int version, ArrayList<String> pluginList) {
		this.name = name;
		this.version = version;
		this.pluginList = pluginList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public ArrayList<String> getPluginList() {
		return pluginList;
	}

	public void setPluginList(ArrayList<String> pluginList) {
		this.pluginList = pluginList;
	}

	public static void main(String[] args) {
		ArrayList<String> chromePluginList=new ArrayList<>();
		chromePluginList.add("spell check");
		chromePluginList.add("test case studio");
		chromePluginList.add("geolocation");
		
		BrowserSession br_chrome =new BrowserSession("Chrome",110, chromePluginList);
		System.out.println(br_chrome.getName());
		System.out.println(br_chrome.getVersion());
		System.out.println(br_chrome.getPluginList());
		System.out.println(br_chrome.getPluginList().size());
		
		
		//adding new values
		chromePluginList.add("html file");
		
		System.out.println("-------------");
		System.out.println(br_chrome.getName());
		System.out.println(br_chrome.getVersion());
		System.out.println(br_chrome.getPluginList());
		System.out.println(br_chrome.getPluginList().size());
	   
	}
}

