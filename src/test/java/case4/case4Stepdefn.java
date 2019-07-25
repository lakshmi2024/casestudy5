package case4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class case4Stepdefn {
	WebDriver driver;	
	@Given("open application")
	public void open_application() {
	    System.setProperty("webdriver.chrome.driver","C:\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/");
	}

	@When("clicks signin")
	public void clicks_signin() {
	    driver.findElement(By.linkText("SignIn")).click();
	}

	@Then("enters username")
	public void enters_username() {
	    driver.findElement(By.name("userName")).sendKeys("lalitha");
	}

	@Then("enter password")
	public void enter_password() {
	    driver.findElement(By.name("password")).sendKeys("password123");
	}

	@Then("click login")
	public void click_login() {
	    driver.findElement(By.name("Login")).click();
	}

	@Then("type product")
	public void type_product() {
	    driver.findElement(By.name("products")).click();
	    driver.findElement(By.name("products")).sendKeys("headphone");
	}

	@Then("click search")
	public void click_search() {
	    driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@Then("check cart")
	public void check_cart() {
	  int sz=driver.findElements(By.linkText("Cart")).size();
	    if(sz==0){
	    	System.out.println("error");
	    }
	}

	@Then("close application")
	public void close_application() {
	    driver.close();
	}


}
