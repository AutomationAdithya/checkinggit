package StepDefinitions;		

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;		

import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;		

public class Steptena {				

    WebDriver driver;			
    		
    @Given("^Open the Chrome and launch the application$")
    public void open_the_Chrome_and_launch_the_application()  {
       System.setProperty("webdriver.chrome.driver","C:\\Users\\Adithya\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");					
       driver= new ChromeDriver();		
       driver.manage().window().maximize();	
       driver.navigate().to("www.demo.guru99.com/v4");
       				
    }		

    @When("^Enter the Username User(\\d+)and Password password(\\d+)$")			
    public void enter_the_Username_and_Password(String username,String password) 						
    {		
       driver.findElement(By.name("uid")).sendKeys(username);					
       driver.findElement(By.name("password")).sendKeys(password);					
    }		

    @Then("^Reset the credential$")					
    public void	Reset_the_credential() 							
    {		
       driver.findElement(By.name("btnReset")).click();					
    }		
}		