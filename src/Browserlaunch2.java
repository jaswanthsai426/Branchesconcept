import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserlaunch2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"Myself\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rbgtechnologies.com/");
	}

}
