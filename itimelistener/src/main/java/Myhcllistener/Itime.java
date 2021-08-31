package Myhcllistener;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Test
@Listeners(Myhcllistener.Listener.class)
public class Itime {
	
	public void itime() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mounika.varadhappan\\Downloads\\chromedriver.exe");
		WebDriver h;
		h= new ChromeDriver();
		h.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		h.get("https://login.microsoftonline.com/189de737-c93a-4f5a-8b68-6f4ca9941912/wsfed?wa=wsignin1.0&wtrealm=https%3a%2f%2fwww.myhcl.com%2fbprhome%2fDefault.aspx&wctx=rm%3d0%26id%3dpassive%26ru%3d%252fbprhome%252fDefault.aspx&wct=2021-08-11T06%3a26%3a53Z&wreply=https%3a%2f%2fwww.myhcl.com%2fbprhome%2fDefault.aspx&sso_reload=true");
		h.findElement(By.xpath("//*[@id=\"i0116\"]")).sendKeys("mounika.varadhappan@hcl.com");
		h.findElement(By.xpath("/html/body/div/form[1]/div/div/div[2]/div[1]/div/div/div/div/div[1]/div[3]/div/div/div/div[4]/div/div/div/div[2]/input")).click();
		Thread.sleep(10000);
		h.findElement(By.xpath("//*[@id=\"i0118\"]")).sendKeys("Mouni@26");
		h.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(10000);


		WebElement e =h.findElement(By.id("txtSearch"));
		e.click();
		e.sendKeys("iTime (Time Sheet Management System)");
		h.findElement(By.xpath("/html/body/ul/li/table/tbody/tr/td[1]/a")).click();
		Thread.sleep(5000);
        WebElement click = h.findElement(By.xpath("//*[@id='mCSB_5_container']/span/div[2]/div/div/div/div/div/div[2]/div/div/div/div/input"));
        click.click();
        click.sendKeys("09:00");

 
       h.findElement(By.xpath("//*[@id='le_apply']")).click();
	}
}
