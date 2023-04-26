import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.List;
import java.util.Random;

import javax.tools.DocumentationTool.Location;

import org.asynchttpclient.Response;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class myTest extends parameter {
	

	@Test(priority = 1)
	public void signUp() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[3]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Malak");
	driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Lataifeh");
	driver.findElement(By.xpath("//*[@id=\"email_address\"]")).sendKeys("lataifehmalk99@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("M@12131415");
	driver.findElement(By.xpath("//*[@id=\"password-confirmation\"]")).sendKeys("M@12131415");
	driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button")).click();
	

		Thread.sleep(3000);
		WebElement WelcomeNameInWebsite = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[1]/span"));
		String ActualWelcomeName = WelcomeNameInWebsite.getText();
		String ExpectedWelcomeName = "Welcome, Malak Lataifeh!";
		MyAssertion.assertEquals(ActualWelcomeName, ExpectedWelcomeName);
		MyAssertion.assertAll();
		System.out.println(ActualWelcomeName+ "************");
		
		
	
	}
	
	
	

	
	
	@Test(priority = 2)
	public void RandomItemSearch()
	{   driver.get("https://magento.softwaretestingboard.com/");
		String [] Items = {"Jacket", "t-shirt", "jeans for men", "jeans for women","pants"};
		
		Random rand = new Random();
		int RandomInputNumber = rand.nextInt(4);
	    String searchBarvalue = Items[RandomInputNumber];
	    driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys(searchBarvalue);
	    System.out.println("selected random item is :" +searchBarvalue);	
		
	}
	
	
	@Test(priority = 3)
	public void HotSellersItems() throws InterruptedException {
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		for(int i=0;i<3;i++) {
			Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[1]/div/div/strong/a"));
		WebElement XS = driver.findElement(By.xpath("(//div[@id='option-label-size-143-item-166'])[1]"));
		WebElement S = driver.findElement(By.xpath("(//div[@id='option-label-size-143-item-167'])[1]"));
		WebElement M = driver.findElement(By.xpath("(//div[@id='option-label-size-143-item-168'])[1]"));
		WebElement L = driver.findElement(By.xpath("(//div[@id='option-label-size-143-item-169'])[1]"));
		WebElement XL = driver.findElement(By.xpath("(//div[@id='option-label-size-143-item-170'])[1]"));
		WebElement Blue = driver.findElement(By.xpath("(//div[@id='option-label-color-93-item-50'])[1]"));
		WebElement Orange = driver.findElement(By.xpath("(//div[@id='option-label-color-93-item-56'])[1]"));
		WebElement Purple = driver.findElement(By.xpath("(//div[@id='option-label-color-93-item-57'])[1]"));
		WebElement[] theSizelist = {XS,S,M,L,XL};
		WebElement[] theColorlistone = {Blue,Orange,Purple};
		Random rand = new Random();
		int RandomsizeNumber = rand.nextInt(5);
		Random rand2 = new Random();
		int RandomcolorNumberone = rand2.nextInt(3);
		theSizelist[RandomsizeNumber].click();
		Thread.sleep(1000);
		theColorlistone[RandomcolorNumberone].click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[contains(text(),'Add to Cart')])[1]")).click();		}
		
		
		
		Thread.sleep(5000);
		for(int i=0;i<2;i++) {
			Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[2]/div"));
		WebElement XS = driver.findElement(By.xpath("(//div[@id='option-label-size-143-item-166'])[2]"));
		WebElement S = driver.findElement(By.xpath("(//div[@id='option-label-size-143-item-167'])[2]"));
		WebElement M = driver.findElement(By.xpath("(//div[@id='option-label-size-143-item-168'])[2]"));
		WebElement L = driver.findElement(By.xpath("(//div[@id='option-label-size-143-item-169'])[2]"));
		WebElement XL = driver.findElement(By.xpath("(//div[@id='option-label-size-143-item-170'])[2]"));
		WebElement Purple = driver.findElement(By.xpath("(//div[@id='option-label-color-93-item-57'])[2]"));
		WebElement White = driver.findElement(By.xpath("(//div[@id='option-label-color-93-item-59'])[1]"));
		WebElement Yellow = driver.findElement(By.xpath("(//div[@id='option-label-color-93-item-60'])[1]"));
		WebElement[] theSizelist = {XS,S,M,L,XL};
		WebElement[] theColorlistone = {Purple,White,Yellow};
		Random rand = new Random();
		int RandomsizeNumber = rand.nextInt(5);
		Random rand2 = new Random();
		int RandomcolorNumberone = rand2.nextInt(3);
		theSizelist[RandomsizeNumber].click();
		Thread.sleep(1000);
		theColorlistone[RandomcolorNumberone].click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@title='Add to Cart'])[2]")).click();
		}
		
		
		
		Thread.sleep(5000);
		for(int i=0;i<4;i++) {
			Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[3]/div"));
		WebElement XS = driver.findElement(By.xpath("(//div[@id='option-label-size-143-item-166'])[3]"));
		WebElement S = driver.findElement(By.xpath("(//div[@id='option-label-size-143-item-167'])[3]"));
		WebElement M = driver.findElement(By.xpath("(//div[@id='option-label-size-143-item-168'])[3]"));
		WebElement L = driver.findElement(By.xpath("(//div[@id='option-label-size-143-item-169'])[3]"));
		WebElement XL = driver.findElement(By.xpath("(//div[@id='option-label-size-143-item-170'])[3]"));
		WebElement Gray = driver.findElement(By.xpath("(//div[@id='option-label-color-93-item-52'])[1]"));
		
		WebElement[] theSizelist = {XS,S,M,L,XL};
		WebElement[] theColorlistone = {Gray};
		Random rand = new Random();
		int RandomsizeNumber = rand.nextInt(5);
		Random rand2 = new Random();
		int RandomcolorNumberone = rand2.nextInt(1);
		
		theSizelist[RandomsizeNumber].click();
		Thread.sleep(1000);
		theColorlistone[RandomcolorNumberone].click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@title='Add to Cart'])[3]")).click();
		}
		
		
			Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[4]/div"));
		Thread.sleep(2000);
		WebElement XS = driver.findElement(By.xpath("(//div[@id='option-label-size-143-item-166'])[4]"));
		WebElement S = driver.findElement(By.xpath("(//div[@id='option-label-size-143-item-167'])[4]"));
		WebElement M = driver.findElement(By.xpath("(//div[@id='option-label-size-143-item-168'])[4]"));
		WebElement L = driver.findElement(By.xpath("(//div[@id='option-label-size-143-item-169'])[4]"));
		WebElement XL = driver.findElement(By.xpath("(//div[@id='option-label-size-143-item-170'])[4]"));
		WebElement Black = driver.findElement(By.xpath("(//div[@id='option-label-color-93-item-49'])[1]"));
		WebElement gray2 = driver.findElement(By.xpath("(//div[@id='option-label-color-93-item-52'])[2]"));
		WebElement Green = driver.findElement(By.xpath("(//div[@id='option-label-color-93-item-53'])[1]"));
		
		WebElement[] theSizelist = {XS,S,M,L,XL};
		WebElement[] theColorlistone = {Black,gray2,Green};
		Random rand = new Random();
		int RandomsizeNumber = rand.nextInt(5);
		Random rand2 = new Random();
		int RandomcolorNumberone = rand2.nextInt(3);
		
		theSizelist[RandomsizeNumber].click();
		Thread.sleep(1000);
		theColorlistone[RandomcolorNumberone].click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@title='Add to Cart'])[4]")).click();
		
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[5]/div/div/strong/a")).click();
		  for(int i=0;i<5;i++) {
				Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
			Thread.sleep(2000);
		  }
		  
		  
		  
	}
	
	
	
	@Test(priority = 4)
	public void CheckoutTest()throws InterruptedException
	{	Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"top-cart-btn-checkout\"]")).click();
		Thread.sleep(6000);
		driver.findElement(By.name("company")).sendKeys("xxxxxx");
		Thread.sleep(9000);
		driver.findElement(By.name("street[0]")).sendKeys("Abu Dhabi");
		Thread.sleep(6000);
		driver.findElement(By.name("street[1]")).sendKeys("Al-Falah Street");
		Thread.sleep(6000);
		driver.findElement(By.name("street[2]")).sendKeys("Golden Tower");
		Thread.sleep(4000);
		driver.findElement(By.name("city")).sendKeys("Abu Dhabi");
		Thread.sleep(4000);
		WebElement StateProvince =  driver.findElement(By.name("region_id"));
		Random myRandom = new Random();                          
		int myRadoooom = myRandom.nextInt(65);
		Select mySelector = new Select(StateProvince);
	    mySelector.selectByIndex(myRadoooom);
	    //System.out.println(StateProvince.getText());
	    Thread.sleep(2000);
		driver.findElement(By.name("postcode")).sendKeys("12555-6789");
		Thread.sleep(2000);
		driver.findElement(By.name("telephone")).sendKeys("568958690");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"checkout-shipping-method-load\"]/table/tbody/tr[1]/td[1]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button")).click();
		
	}
	
	
	
	@Test(priority = 5)
	public void PLACEORDER ()throws InterruptedException {
	
		Thread.sleep(10000);         
		driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/p[1]/a")).click();
		                              
		Thread.sleep(5000);
		
		
		WebElement SubTotal= driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tfoot/tr[1]/td/span"));
		String Sub = SubTotal.getText();
		System.out.println(Sub);
		String splitedTextone  = Sub.replace("$", "");
		Double Svalue = new Double(splitedTextone);
		System.out.println(Svalue);
		
		Thread.sleep(5000);
		WebElement Discount= driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tfoot/tr[2]/td/span"));
		String Dis = Discount.getText();
		System.out.println(Dis);
		String splitedTextTwo  =  Dis.replace("-$","");
		 Double Dvalue = new Double(splitedTextTwo);
		System.out.println(Dvalue);
	
		Thread.sleep(3000);
		WebElement  Shipping= driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tfoot/tr[3]/td/span"));
		String Ship = Shipping.getText();
		System.out.println(Ship);
		String splitedTextThree  =  Ship.replace("$","");
		Double Shvalue = new Double(splitedTextThree);
		System.out.println(Shvalue);
		
		
		Thread.sleep(3000);
		WebElement  GrandTotal= driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tfoot/tr[4]/td/strong/span"));
		String Total = GrandTotal.getText();
		System.out.println(Total);
		String splitedTextFour  =  Total.replace("$","");
		Double Tvalue = new Double(splitedTextFour);
		System.out.println(Tvalue);

	    Double ExpectedValue = Svalue-Dvalue-Shvalue ;
	    System.out.println("Expected value is :");
	    System.out.println(ExpectedValue);
	    System.out.println("Actual value is :");
	    System.out.println(Tvalue);
	    MyAssertion.assertEquals(Tvalue, ExpectedValue, 0.0000);
		MyAssertion.assertAll();
		
	}
	
	
	@Test(priority = 6)
	public void ReOrder()throws InterruptedException
	{
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/span/button")).click();                            
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a")).click();                          
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("lataifehmalk99@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("M@12131415");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
		Thread.sleep(3000);
		for(int i=0;i<5;i++) {
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/span/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/div/ul/li[1]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"block-collapsible-nav\"]/ul/li[2]/a")).click();
		                            
		Thread.sleep(3000);         
		driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tbody/tr[1]/td[6]/a[2]")).click();
		Thread.sleep(3000);   
		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/ul/li/button")).click();
		Thread.sleep(8000);         
		driver.findElement(By.xpath("//*[@id=\"checkout-shipping-method-load\"]/table/tbody/tr[1]/td[1]/input")).click();
		Thread.sleep(3000);         
		driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button")).click();
		Thread.sleep(10000);  
		                            
		driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button")).click();
		Thread.sleep(5000);
		
		
		}
		
	}
	
	
	@Test(priority = 7)
	public void CheckTheOrdersPrices ()throws InterruptedException
	{   Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/span/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/div/ul/li[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"block-collapsible-nav\"]/ul/li[2]/a")).click();
		Thread.sleep(3000);
		WebElement priceOne= driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tbody/tr[1]/td[4]/span"));
		String pOne = priceOne.getText();
		Thread.sleep(3000);
		WebElement priceTwo= driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tbody/tr[2]/td[4]/span"));
		String pTwo = priceTwo.getText();
		Thread.sleep(3000);
		WebElement priceThree= driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tbody/tr[3]/td[4]/span"));
		String pThree = priceThree.getText();
		Thread.sleep(3000);
		WebElement priceFour= driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tbody/tr[4]/td[4]/span"));
		String pFour = priceFour.getText();
		Thread.sleep(3000);
		WebElement priceFive= driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tbody/tr[5]/td[4]/span"));
		String pFive = priceFive.getText();
		String [] ActualPrices= {pOne,pTwo,pThree,pFour,pFive};
		String [] ExpectedPrices= {pOne,pOne,pOne,pOne,pOne};
		MyAssertion.assertEquals(ActualPrices, ExpectedPrices);
		MyAssertion.assertAll();
		
		
		
	}
	
	}


