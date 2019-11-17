package seleniumpart1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicConcept {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\geckodriver.exe");
       // ChromeDriver driver=new ChromeDriver();
        driver= new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        driver.get("https://www.crmpro.com");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("khamerbari");
        driver.findElement(By.name("password")).sendKeys("shahin786");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
       String st= driver.getTitle();
       if(st.equals("CRMPRO")) {
    	   System.out.println("correct title");
       }else {
    	   System.out.println("in-correct title");
       }
        
        driver.quit();
	}

}
