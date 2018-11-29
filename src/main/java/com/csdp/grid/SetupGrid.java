package com.csdp.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SetupGrid {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
		
		String huburl = "http://192.168.1.122:1111/wd/hub";
		
		WebDriver driver = new RemoteWebDriver(new URL(huburl), cap);
		
		driver.get("https://www.freecrm.com/index.html");
		System.out.println(driver.getTitle());
		
		

	}

}
