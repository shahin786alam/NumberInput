package OopConceptPart1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JdbcConnectionExample2 {

	public static void main(String[] args) throws SQLException {

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();   //launch chrome
		driver.get("https://www.crmpro.com");
		//step 1
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orclpdb","pdbadmin","alam1234");
		//step 2.
		Statement st=con.createStatement();
		//step 3.
		String s="select USER_NAME,Password from CRMLOGING";
		//step 4
		ResultSet rs=st.executeQuery(s);
		while(rs.next()) {
			String USER_NAME=rs.getString("USER_NAME");
			String Password=rs.getString("Password");

			driver.findElement(By.name("username")).sendKeys(USER_NAME);
			driver.findElement(By.name("password")).sendKeys(Password);
			driver.findElement(By.xpath("//input[@type='submit']")).click();

			if(driver.getTitle().equals("CRMPRO - CRM software for customer relationship management, sales, and support.")) {
				System.out.println("test case passed");
			}
			else {
				System.out.println("test case failed");	
			}

			//driver.findElement(By.linkText("Home")).click();
			System.out.println(USER_NAME+"");
			System.out.println(Password);
			
		}

		//step 5
		con.close();

		System.out.println("program is Executed");


	}

}
