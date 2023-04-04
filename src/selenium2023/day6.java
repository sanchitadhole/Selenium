package selenium2023;

import org.openqa.selenium.Point;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class day6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanchita\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//method - getSize()
		System.out.println(driver.findElement(By.id("nav-logo-sprites")).getSize());   //(128, 50)
		
		Dimension d = driver.findElement(By.id("nav-logo-sprites")).getSize();
		
		System.out.println(d.height);  //50
		System.out.println(d.width);    //128
		
		//method - Location
		
		System.out.println(driver.findElement(By.id("nav-logo-sprites")).getLocation());  //Location ka data type Point
		Point p = driver.findElement(By.id("nav-logo-sprites")).getLocation();
		
		System.out.println(p.x);  // 2
		System.out.println(p.y);   //5
		
		//method - getAttribute
		
		String h = driver.findElement(By.id("nav-logo-sprites")).getAttribute("class");
		System.out.println(h);
		
		//method  - getTagName
		
		String h1 = driver.findElement(By.id("nav-logo-sprites")).getTagName();
		System.out.println(h1); //a
		
		//getCssValue   -- on element give value
		
		String h2 = driver.findElement(By.id("nav-logo-sprites")).getCssValue("color");
		System.out.println(h2);
		
		
		
		
		
		
			

	}

}
