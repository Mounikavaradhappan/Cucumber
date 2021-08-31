package Scenariofirst;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scene1 {

	
	
	WebDriver d1;

	@Given("open chrome browser and url of the application")
	public void Open_chrome_browser_and_url_of_the_application() {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\mounika.varadhappan\\Downloads\\chromedriver.exe");
		d1=new ChromeDriver();
		d1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d1.get("https://login.microsoftonline.com/189de737-c93a-4f5a-8b68-6f4ca9941912/wsfed?wa=wsignin1.0&wtrealm=https%3a%2f%2fwww.myhcl.com%2fbprhome%2fDefault.aspx&wctx=rm%3d0%26id%3dpassive%26ru%3d%252fbprhome%252fDefault.aspx&wct=2021-08-11T06%3a26%3a53Z&wreply=https%3a%2f%2fwww.myhcl.com%2fbprhome%2fDefault.aspx&sso_reload=true");
		System.out.println("given url done");
	}

	@When("Enter username and password")
	public void Enter_username_and_password() throws InterruptedException {
		
		d1.findElement(By.xpath("//*[@id=\"i0116\"]")).sendKeys("mounika.varadhappan@hcl.com");
		d1.findElement(By.xpath("/html/body/div/form[1]/div/div/div[2]/div[1]/div/div/div/div/div[1]/div[3]/div/div/div/div[4]/div/div/div/div[2]/input")).click();
		Thread.sleep(5000);
		d1.findElement(By.xpath("//*[@id=\"i0118\"]")).sendKeys("Mouni@26");
		
		
	}

	@Then("Login success")
	public void Login_success() throws InterruptedException {

		d1.findElement(By.xpath("//input[@type='submit']")).click();
		
		
	}
	@Given("open chrome browser and myhcl")
	public void Open_chrome_browser_and_myhcl() throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\mounika.varadhappan\\Downloads\\chromedriver.exe");
		d1=new ChromeDriver();
        d1 = new ChromeDriver();
        Thread.sleep(5000);
        d1.get("https://www.myhcl.com/bprhome/Home/Index");
        d1.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		System.out.println("given url done");
	}

	@When("Enter username1 and password1")
	public void Enter_username1_and_password1() throws InterruptedException {
		
		d1.findElement(By.xpath("//*[@id=\"i0116\"]")).sendKeys("mounika.varadhappan@hcl.com");
		d1.findElement(By.xpath("/html/body/div/form[1]/div/div/div[2]/div[1]/div/div/div/div/div[1]/div[3]/div/div/div/div[4]/div/div/div/div[2]/input")).click();
		Thread.sleep(5000);
		d1.findElement(By.xpath("//*[@id=\"i0118\"]")).sendKeys("Mouni@26");
		d1.findElement(By.xpath("//input[@type='submit']")).click();
		
		
	}
	
	
	@Then("Enter itime in text search box")
    public void enter_itime_in_text_search_box() throws InterruptedException {
        
        WebElement txt = d1.findElement(By.id("txtSearch"));
        txt.click();
        txt.sendKeys("iTime (Time Sheet Management System)");
        d1.findElement(By.xpath("/html/body/ul/li/table/tbody/tr/td[1]/a")).click();
        Thread.sleep(3000);
        System.out.println("Entered text Successfully");

    }
	@And("Enter time in timesheet")
    public void enter_time_in_timesheet() throws InterruptedException {
        
        
        WebElement TimeEnter=d1.findElement(By.xpath("/html/body/main/div/div[2]/section/div[4]/div[1]/div/div/div/div[2]/div/div[1]/span/div[2]/div/div/div/div/div/div[2]/div/div/div/div/input"));
        Thread.sleep(5000);
        TimeEnter.click();
        Thread.sleep(5000);
        TimeEnter.sendKeys("09:00");
        System.out.println("Time Entered Successfully");    

    }
	
	@And("Save the time")
    public void save_the_time() {
        
       
        d1.findElement(By.id("le_apply")).click();
        
        System.out.println("Time Saved Successfully");
    }
}

