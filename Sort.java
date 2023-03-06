package salesForce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sort {
 public static void main(String[] args) {
	
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
	 
	 WebElement sort = driver.findElement(By.xpath("//span[text()='Dashboard Name']"));
		
	 Actions move=new Actions(driver);
		
	 move.moveToElement(sort).perform();
		
	 sort.click();
	 
	 
	 
	 
}
}
/*
Verify Dashboards sort order by Dashboard name
1. Login to https://login.salesforce.com
2. Click on the toggle menu button from the left corner
3. Click View All and click Dashboards from App Launcher
4. Click on the Dashboards tab 
5. Click the sort arrow in the Dashboard Name.
6. Verify the Dashboard displayed in ascending order by Dashboard name."	

Expected Result:
Dashboards should be displayed in ascending order by Dashboard nam*/