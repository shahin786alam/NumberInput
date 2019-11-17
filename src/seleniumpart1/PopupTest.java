package seleniumpart1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://html.com/input-type-file/");
		driver.findElement(By.cssSelector("#fileupload")).sendKeys("path");	
//		driver.findElement(By.xpath("//a[@class='black']")).click();
//		Set <String> handle=driver.getWindowHandles();
//		
//		Iterator<String> it=handle.iterator();
//		String paraentwindowid=it.next();
//		System.out.println("paraentwindow id is "+paraentwindowid);
//		String chieldwindowsid=it.next();
//		System.out.println("chieldwindows id is "+chieldwindowsid);
//		driver.switchTo().window(paraentwindowid);
//		String patitle=driver.getTitle();
//		System.out.println(patitle);
//		driver.switchTo().window(chieldwindowsid);
//		String chtitle=driver.getTitle();
//		System.out.println(chtitle);
//		
//		driver.quit();
//

	}

}
