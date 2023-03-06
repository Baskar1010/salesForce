package salesForce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditDashboard {
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
	 
	 driver.findElement(By.xpath("//div[@class='slds-hyphenate']")).click();
	 
	 Thread.sleep(5000);
	 
	 
	 WebElement frame = driver.findElement(By.xpath("//div[@class='dashboardContainer']//iframe"));
	
	 driver.switchTo().frame(frame);
		
     WebElement edit = driver.findElement(By.xpath("//button[@class='slds-button slds-button_neutral edit']"));
	 
	 edit.click();
	 
	// driver.findElement(By.xpath("//button[@title='Edit Dashboard Properties']")).click();
	
	 //WebElement edit2 = driver.findElement(By.xpath("//input[@class='slds-input']"));
	 
	 //edit2.sendKeys("salesforce");
	 
	 driver.switchTo().defaultContent();
	 
	 WebElement frame2 =driver.findElement(By.xpath("//div[@class='dashboardContainer']//iframe"));
     
	 driver.switchTo().frame(frame2);
     
     driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon-border-filled editProperties']")).click();
     
     driver.findElement(By.xpath("(//div[@class='slds-form-element__control']//input[@class='slds-input'])[2]")).sendKeys("welcome"); 
     
     Thread.sleep(2000);
	 
     String title = driver.getTitle();   
	 
     WebElement save = driver.findElement(By.xpath("(//button[text()='Save'])[2]"));
	 
     save.click();
	 
	 WebElement done = driver.findElement(By.xpath("//button[text()='Done']"));
	 
     done.click();
	 
	 WebElement confirm = driver.findElement(By.xpath("//footer[@class='slds-modal__footer']//button[text()='Save']"));
     
     confirm.click();
     
     Thread.sleep(2000);
	 
     String title2 = driver.getTitle();
     
     if(title.equals(title2)) {
  	   
    	 System.out.println("The Dashboard is Edited Successfully");
    	 
     }
	 
}
}




/*
Edit Dashboard
1. Login to https://login.salesforce.com
2. Click on the toggle menu button from the left corner
3. Click View All and click Dashboards from App Launcher
4. Click on the Dashboards tab 
5. Search the Dashboard 'Salesforce Automation by Your Name'
6. Click on the Dropdown icon and Select Edit
7.Click on the Edit Dashboard Properties icon
8. Enter Description as 'SalesForce' and click on save.
9. Click on Done and  Click on save in the popup window displayed.
10. Verify the Description."

Expected Result:
The Dashboard is Edited Successfully
*/