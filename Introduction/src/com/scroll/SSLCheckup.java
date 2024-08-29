package com.scroll;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheckup {
public static void main(String[] args) {
	ChromeOptions options = new ChromeOptions();
	options.setAcceptInsecureCerts(true);
	Proxy proxy = new Proxy();
	proxy.setHttpProxy("4444");
	//options.setExperimentalOption("Hari", proxy);
	options.setCapability("proxy",proxy);
	WebDriver driver = new ChromeDriver(options);
	driver.get("https://expired.badssl.com/");
	
	
	
}
}
