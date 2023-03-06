package salesForce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Delete {
 public static void main(String[] args) throws InterruptedException {
	
	 ChromeDriver driver = new ChromeDriver();
	 
	 driver.get("https://qeagle-dev-ed.my.salesforce.com/");
	 
     driver.manage().window().maximize();
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 
	 driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
	 
	 driver.findElement(By.id("password")).sendKeys("Leaf@123");
	 
	 driver.findElement(By.id("Login")).click();
	 
	 driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	 
	 driver.findElement(By.xpath("//button[text()='View All']")).click();
	 
	 driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Dashboards");
	 
	 driver.findElement(By.xpath("//mark[text()='Dashboards']")).click();
	 
	 WebElement search = driver.findElement(By.xpath("//input[@class='search-text-field slds-input input uiInput uiInputText uiInput--default uiInput--input']"));
	 
	 search.sendKeys("Baskar", Keys.ENTER);
	 
	 Thread.sleep(3000);
	 
	 WebElement brands=driver.findElement(By.xpath("(//button[@class='slds-button slds-button_icon-border slds-button_icon-x-small'])[1]//following::lightning-primitive-icon"));
		
	 Actions move=new Actions(driver);
		
	 move.moveToElement(brands).perform();
		
	 brands.click();

	 driver.findElement(By.xpath("//span[text()='Delete']")).click();
	 
	 driver.findElement(By.xpath("//span[text()='Delete']/parent::button")).click();
	 
	 String title = driver.getTitle();
	
	 System.out.println(title);
	 
	 
	 
	 
	 
	 
	 
}
}


/*
Delete Dashboard
1. Login to https://login.salesforce.com
2. Click on the toggle menu button from the left corner
3. Click View All and click Dashboards from App Launcher
4. Click on the Dashboards tab 
5. Search the Dashboard 'Salesforce Automation by Your Name'
6. Click on the Dropdown icon and Select Delete
7.Click on the Delete option in the displayed popup window.
8. Verify Whether Dashboard is Deleted using Dashboard Name"

Expected Result:
The Dashboard is deleted Successfully 

*/