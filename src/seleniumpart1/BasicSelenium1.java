
package seleniumpart1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSelenium1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.crmpro.com");
		//driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		//String source=driver.getPageSource();
		//System.out.println(source);
		String title=driver.getTitle();
		System.out.println(title);
		if (title.equals("CRMPRO - CRM software for customer relationship management, sales, and support.")) {
			System.out.println("Correct page title");
		}else {
			System.out.println("in-correct page title");
		}
		List<WebElement> totallinks=driver.findElements(By.tagName("a"));
		System.out.println("Total links are "+totallinks.size());
		for(int i=0; i<totallinks.size(); i++) {
			String links=totallinks.get(i).getText();
			System.out.println(links);
		}
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("khamerbari");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Shahin786");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//a[@href='https://www.crmpro.com/index.cfm?logout=1']")).click();
		driver.quit();
	}

}
