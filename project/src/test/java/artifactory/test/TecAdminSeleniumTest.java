import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class TecAdminSeleniumTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.addArguments("--headless");
		chromeoptions.addArguments("--no-sandbox");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "http://35.244.43.37:8081/project-1.0-RAMA/";
		String actualTitle = "";
        String expectedTitle = "Welcome to Continous Integration with Jenkins";
        

        driver.get(baseUrl);
        actualTitle = driver.getTitle();
		
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Has Passed!");
        } else {
            System.out.println("Test has Failed");
        }

        driver.close();
    }
}
