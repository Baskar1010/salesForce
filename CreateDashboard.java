package salesForce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateDashboard {
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
	 
	 Thread.sleep(3000);

	 driver.findElement(By.xpath("//div[text()='New Dashboard']")).click();
	 
	 WebElement newDashboard = driver.findElement(By.xpath("//div[@class='dashboardContainer']//iframe"));
	 
	 driver.switchTo().frame(newDashboard);
	 
	 WebElement findElement = driver.findElement(By.xpath("//input[@class='slds-input']"));
	 
	 findElement.sendKeys("Salesforce Automation by Baskar");
	 
	 driver.findElement(By.id("submitBtn")).click();
	 
	 driver.switchTo().defaultContent();
	 
	 Thread.sleep(2000);
	 
	 WebElement save = driver.findElement(By.xpath("//div[@class='dashboardContainer']//iframe"));
	 
	 driver.switchTo().frame(save);
	 
	 Thread.sleep(2000);
	 
	 WebElement save2 = driver.findElement(By.xpath("//button[text()='Save']"));
	 
	 save2.click();
	 
	 String title = driver.getTitle();
	 
	// System.out.println(title);
	 
	 driver.findElement(By.xpath("//button[text()='Done']")).click();
     
	 String title2= driver.getTitle();
	
	 //System.out.println();
     
	 if(title.equals(title2)) {
     	
		 System.out.println("The New Dashboard is created Successfully");
     
     }
	 
	 
	 
	 
	 
}
}





/*Create New Dashboard	
1. Login to https://login.salesforce.com
2. Click on the toggle menu button from the left corner
3. Click View All and click Dashboards from App Launcher
4. Click on the New Dashboard option
5. Enter Name as 'Salesforce Automation by Your Name ' and Click on Create.
6.Click on Save and Verify Dashboard name.

Expected Result:
The New Dashboard is created Successfully


UserName:hari.radhakrishnan@qeagle.com
Password:Leaf@123
*/