	package stepDefinitions;
	
	import java.util.concurrent.TimeUnit;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;
	
	public class CucumberBDDTest {
	
		WebDriver driver;
	
		@Given("^User Open Chrome Browser$")
		public void user_Open_Chrome_Browser() {
	
			System.setProperty("webdriver.chrome.driver","C:\\Users\\koree\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
	
		@Given("^User Launching URL$")
		public void user_Launching_URL() {
			driver.get("http://app.hubspot.com/login");
	
		}
	
		@Given("^User Click Signup Link$")
		public void user_Click_Signup_Link() {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}  
			driver.findElement(By.xpath("//*[text()='Sign up']")).click();
	
		}
	
		@When("^User Enter Firstname and Lastname$")
		public void user_Enter_Firstname_and_Lastname() {
	
			driver.findElement(By.id("uid-firstName-5")).sendKeys("Peter");  
			driver.findElement(By.id("uid-lastName-6")).sendKeys("Akin");
		}
	
		@When("^User Enter Emailaddress$")
		public void user_Enter_Emailaddress() {
	
			driver.findElement(By.id("uid-email-7")).sendKeys("inro4ebony@gmail.com");
		}
	
		@When("^User Click Next Button$")
		public void user_Click_Next_Button() {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}     
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		}
	
		@When("^User Click Go to Gmail$")
		public void user_Click_Go_to_Gmail() {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}  
			
			driver.findElement(By.xpath("//*[text()='Go to Gmail']")).click();

		}
	
		@Then("^User navigate to Home Page$")
		public void user_navigate_to_Home_Page() {
			
			driver.quit();
	
		}
	
	}
