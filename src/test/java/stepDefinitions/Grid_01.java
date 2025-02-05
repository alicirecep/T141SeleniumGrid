package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Grid_01 {

	static WebDriver driver;

	public static void main(String[] args) throws MalformedURLException {

		driver = new RemoteWebDriver(new URL("http://192.168.0.163:4444"), new ChromeOptions());
		// Ust satirda Class seviyesinde create ettigimiz driver'in icerisine RemoteWebDriver set edilerek atamasi yapildi.
		// Herhangi spesifik bir capabilities girmedik Onun yerine Node icinde var olan Chrome browser ile calis dedik.


		// Asagiya test kodlarimizi yazdik.
		driver.get("https://www.wisequarter.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());


	}


	@Test
	void firefoxTest() throws MalformedURLException {

		driver = new RemoteWebDriver(new URL("http://192.168.0.163:4444"), new FirefoxOptions());

		driver.get("https://qa.flavorfetch.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());


	}





}
