package selenium2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanchita\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///E:/Javascript/page.html");
		
		
		//locator by id
		WebElement p1 = driver.findElement(By.id("one"));
		if(p1.getText().contains("one")) {
			System.out.println("Testcase pass 1");
		}
		
		//by class name
		WebElement p2 = driver.findElement(By.className("two"));
		if(p2.getText().contains("hellooo")) {
			System.out.println("Testcase pass 2");
		}
		
		//by name
		WebElement p3 = driver.findElement(By.name("nm"));
		
		if(p3.isDisplayed()) {
			System.out.println("Testcase pass3 ");
			
		
			
		//by linkText
			
		WebElement p4 = driver.findElement(By.linkText("github"));
		if(p4.isDisplayed()) {
			System.out.println(" TestCase pass 4");
		}
		
		//by partial link
		
		WebElement p5 = driver.findElement(By.partialLinkText("hub"));
		if(p5.isDisplayed()) {
			System.out.println("Testcase pass 5");
		}
			
		//by TagName
		
		WebElement p6 =driver.findElement(By.tagName("h1"));
		if(p6.isDisplayed()) {
			System.out.println("Testcase pass 6");
		}
		//by xpath
		
		WebElement p7 = driver.findElement(By.xpath("//*[@id=\"one\"]"));
		if(p7.isDisplayed()) {
			System.out.println("Testcase pass 7");
		}
		
		//by css
		
		WebElement p8 = driver.findElement(By.cssSelector("h1[id='one']"));
		if(p8.isDisplayed()) {
			System.out.println("Test case pass 8");
		}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
