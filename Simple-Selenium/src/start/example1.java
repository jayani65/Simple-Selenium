package start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class example1 {
	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium app\\drivers\\chromedriver.exe");
		// System.setProperty("webdriver.edge.driver", "C:\\selenium app\\drivers\\msedgedriver.exe");
		driver = new ChromeDriver();
		// driver = new EdgeDriver();
		driver.get("https://www.selenium.dev/");

		example1 ob = new example1();
		ob.testcase1();
		// ob.testcase2();
		ob.testcase3();
		ob.testcase4();

	}
	public void testcase1() {
		String expecttitle = "SeleniumHQ Browser Automation";
		String actualtitle = "";
		
		actualtitle = driver.getTitle();
		if (actualtitle.contentEquals(expecttitle)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		
	}
	public void testcase2() {
		String Source= driver.getPageSource();
		System.out.println(Source);
	}
	public void testcase3(){
		String expectUrl="https://www.selenium.dev/";
		String url = driver.getCurrentUrl();
		if (url.contentEquals(expectUrl)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		} 
		System.out.println(url);
	}
	public void testcase4() {
		String text = driver.findElement(By.className("banner-notification")).getText();
		System.out.println(text);
	}

}
