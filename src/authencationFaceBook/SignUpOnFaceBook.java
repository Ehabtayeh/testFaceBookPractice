package authencationFaceBook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpOnFaceBook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Desktop\\Ehab(QA)\\MyChromeNewWebDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.facebook.com");
		Thread.sleep(3000);

		String testEmail = "ehabt892@gmail.com";
		//String passWord = "201010566Ehab";
		
//		This test is if you enter the invalid password and valid email : 
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(testEmail);
//		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(passWord);
//		driver.findElement(By.xpath("//button[@name='login']")).click();
//		Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[2]/div[2]/a")).click();
//        driver.findElement(By.xpath("//*[@id=\"initiate_interstitial\"]/div[3]/div/div[1]/button")).click();
        
//        This test is if you enter the valid password and valid email : 
        String passWord2 = "201010566Ehabdatabase@!=Q";
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(testEmail);
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(passWord2);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}

}
