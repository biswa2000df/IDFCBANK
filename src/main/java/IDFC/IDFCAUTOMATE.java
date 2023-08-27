package IDFC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class IDFCAUTOMATE {

	public static void main(String args[]) throws InterruptedException {
		m1();
		
	
	}
	
	public static void m1() throws InterruptedException {	
		
		
		System.setProperty("webdriver.edge.driver", "C:\\browserdrivers\\msedgedriver.exe");
				
				WebDriver driver=new EdgeDriver();
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				
				driver.get("https://my.idfcfirstbank.com/login");
				
//				driver.navigate().refresh();
			/*	driver.get("https://my.idfcfirstbank.com/login");
				
				driver.findElement(By.name("mobileNumber")).sendKeys("7978067010");
				
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//span[(text()='Proceed to login')]")).click();
				
				Thread.sleep(3000);
				
				driver.findElement(By.id("login-password-input")).sendKeys("Kanha@@@316");
				
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//span[(text()='Login securely')]")).click();
				
				Thread.sleep(9000);
				
				WebElement element = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/header/div/div[2]/div/div/div/a[2]/span"));
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();", element);
				
				WebElement ele=driver.findElement(By.xpath("//*[@id=\"MainContentWrapper\"]/section/section/section/div[1]/div[2]/div/div[2]/div/div[2]/div/div/h2/span"));
				
				String s1=ele.getText();
				
				String amount=null;
				
				amount=s1.substring(1,7);
				
				System.out.println(amount);
				
				driver.quit();*/
				
				
			}

}
