import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertyFileReader 
{
	static WebDriver driver;
	

	public static void main(String[] args) throws Throwable 
	{
		FileInputStream f = new FileInputStream("C:\\Users\\hp\\naruto\\Myself\\ObjectRepo\\Configure.properties");
		Properties p = new Properties();
		p.load(f);
		String s1=p.getProperty("browser");
		System.out.println(s1);
		
		if(s1.equals("Chrome"))
		{
			driver= new ChromeDriver();
		}
		else if (s1.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		else if (s1.equals("Firefox"))
		{
			driver= new FirefoxDriver();
		}
	}

}
