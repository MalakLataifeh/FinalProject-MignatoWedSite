import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class parameter {
	
	WebDriver driver = new EdgeDriver();
	SoftAssert MyAssertion = new SoftAssert();
	
	@BeforeTest
	public void mysetup()
	{ driver.get("https://magento.softwaretestingboard.com/");

	
	}
	
 
}
