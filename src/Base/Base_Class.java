package Base;

public class Base_Class {
	
	public static void ConfigueFirefox(){
		String key="webdriver.gecko.driver";
		String value="./software/geckodriver.exe";
		System.setProperty(key, value);
	}
	
	public static void ConfigueChrome(){
		String key="webdriver.chrome.driver";
		String value="./software/chromedriver.exe";
		System.setProperty(key, value);
	}

}
