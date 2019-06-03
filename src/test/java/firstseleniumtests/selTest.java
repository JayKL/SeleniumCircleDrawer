package firstseleniumtests;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selTest {
	WebElement we;
	static WebDriver driver;
	String url = "https://www.youidraw.com/apps/painter/?_ga=2.83292886.199652500.1559576441-1043776802.1559576441";

	@BeforeClass
	public static void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Drivers\\chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterClass
	public static void teardown() throws InterruptedException {
	}

	@Test
	public void test1() throws InterruptedException {
		driver.get(url);
		Actions action = new Actions(driver);
		we=driver.findElement(By.xpath("//*[@id=\"cmbPencil\"]"));
		action.moveToElement(we).perform(); 
		we.sendKeys(Keys.ARROW_UP);
		we.sendKeys(Keys.ENTER);
		action.moveByOffset(400, 400).perform();
		int r = 200;
		int d = 3 - (2 * r);
		int x = 0;
		int y = r;
		int xc=0;
		int yc=0;
		action.moveByOffset(x, y).clickAndHold().perform();
		action.moveByOffset(0, 1).perform();
		action.moveByOffset(0,- 1).perform();
		action.release().perform();
		action.moveByOffset(-x, -y).perform();

		
		action.moveByOffset(xc-x, y).perform();
		action.clickAndHold().perform();
		action.moveByOffset(0, 1).perform();
		action.moveByOffset(0,- 1).perform();
		action.release().perform();
		action.moveByOffset(-(xc-x), -y).perform();

		
		
		action.moveByOffset(x,yc -y).perform();
		action.clickAndHold().perform();
		action.moveByOffset(0, 1).perform();
		action.moveByOffset(0,- 1).perform();
		action.release().perform();
		action.moveByOffset(-x,-(yc -y)).perform();

		
		
		action.moveByOffset(xc-x,yc -y).perform();
		action.clickAndHold().perform();
		action.moveByOffset(0, 1).perform();
		action.moveByOffset(0,- 1).perform();
		action.release().perform();
		action.moveByOffset(-(xc-x),-(yc -y)).perform();

		
		
		action.moveByOffset(y, x).perform();
		action.clickAndHold().perform();
		action.moveByOffset(0, 1).perform();
		action.moveByOffset(0,- 1).perform();
		action.release().perform();
		action.moveByOffset(-y, -x).perform();

		action.moveByOffset(xc-y, x).perform();
		action.clickAndHold().perform();
		action.moveByOffset(0, 1).perform();
		action.moveByOffset(0,- 1).perform();
		action.release().perform();
		action.moveByOffset(-(xc-y), -x).perform();

		
		action.moveByOffset(y,yc -x).perform();
		action.clickAndHold().perform();
		action.moveByOffset(0, 1).perform();
		action.moveByOffset(0,- 1).perform();
		action.release().perform();
		action.moveByOffset(-y,-(yc -x)).perform();

		action.moveByOffset(xc-y,yc -x).perform();
		action.clickAndHold().perform();
		action.moveByOffset(0, 1).perform();
		action.moveByOffset(0,- 1).perform();
		action.release().perform();
		action.moveByOffset(-(xc-y),-(yc -x)).perform();


		while (y>=x) {
			x++;
			if (d > 0) {
				y--;
				d = d + 4 * (x - y) + 10;
			} else {
				d = d + (4 * x) + 6;
			}
			action.moveByOffset(x, y).clickAndHold().perform();
			action.moveByOffset(0, 1).perform();
			action.moveByOffset(0,- 1).perform();
			action.release().perform();
			action.moveByOffset(-x, -y).perform();

			
			action.moveByOffset(xc-x, y).perform();
			action.clickAndHold().perform();
			action.moveByOffset(0, 1).perform();
			action.moveByOffset(0,- 1).perform();
			action.release().perform();
			action.moveByOffset(-(xc-x), -y).perform();

			
			
			action.moveByOffset(x,yc -y).perform();
			action.clickAndHold().perform();
			action.moveByOffset(0, 1).perform();
			action.moveByOffset(0,- 1).perform();
			action.release().perform();
			action.moveByOffset(-x,-(yc -y)).perform();

			
			
			action.moveByOffset(xc-x,yc -y).perform();
			action.clickAndHold().perform();
			action.moveByOffset(0, 1).perform();
			action.moveByOffset(0,- 1).perform();
			action.release().perform();
			action.moveByOffset(-(xc-x),-(yc -y)).perform();

			
			
			action.moveByOffset(y, x).perform();
			action.clickAndHold().perform();
			action.moveByOffset(0, 1).perform();
			action.moveByOffset(0,- 1).perform();
			action.release().perform();
			action.moveByOffset(-y, -x).perform();

			action.moveByOffset(xc-y, x).perform();
			action.clickAndHold().perform();
			action.moveByOffset(0, 1).perform();
			action.moveByOffset(0,- 1).perform();
			action.release().perform();
			action.moveByOffset(-(xc-y), -x).perform();

			
			action.moveByOffset(y,yc -x).perform();
			action.clickAndHold().perform();
			action.moveByOffset(0, 1).perform();
			action.moveByOffset(0,- 1).perform();
			action.release().perform();
			action.moveByOffset(-y,-(yc -x)).perform();

			action.moveByOffset(xc-y,yc -x).perform();
			action.clickAndHold().perform();
			action.moveByOffset(0, 1).perform();
			action.moveByOffset(0,- 1).perform();
			action.release().perform();
			action.moveByOffset(-(xc-y),-(yc -x)).perform();


		}

		// we=driver.findElement(By.xpath("//*[@id=\"bigCookie\"]"));

	}
}
