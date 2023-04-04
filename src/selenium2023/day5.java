package selenium2023;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanchita\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		WebElement firstname = driver.findElement(By.cssSelector("input[name=\'first_name']"));
		WebElement lastname = driver.findElement(By.cssSelector("input[name=\'last_name']"));
		WebElement Email = driver.findElement(By.cssSelector("input[name=\'email']"));
		WebElement comments = driver.findElement(By.cssSelector("textarea[name=\'message\']"));
		WebElement button = driver.findElement(By.cssSelector("input[type=\'submit\']"));
		WebElement h2 = driver.findElement(By.tagName("h2"));
		
		
//		WebElement Methods
		
		// 1. isDisplayed()
		// 2. sendKeys()
		// 3. click()
		// 4. submit()
		// 5. quit()
		
//		 1. isDisplayed()
		if(h2.isDisplayed()) {
			System.out.println("Testcase passsss");
		}else {
			System.out.println("Testcase fail");
		}
		
		// 2. sendKeys()           ///input or textarea tagname asel tr true return karel
		
		firstname.sendKeys("sanchita");
		lastname.sendKeys("Dhole");
		Email.sendKeys("sanchita@yahoo.com");
		comments.sendKeys("I am going to haidarabad");
		
		// 3. click()
		button.click();
		
		// 4. submit()
//		button.submit();
		
		
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		System.out.println(driver.findElement(By.cssSelector("input[value= 'lettuce']")).isEnabled());
		System.out.println(driver.findElement(By.cssSelector("input[value= 'cabbage']")).isEnabled());
		System.out.println(driver.findElement(By.cssSelector("input[value= 'pumpkin']")).isSelected());
			
		
		driver.quit();
		
		
	
	}

}
