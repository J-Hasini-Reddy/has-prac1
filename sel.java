package Docker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class Example {
    public static void main(String[] args) {
        try {
            // Set Firefox options
            FirefoxOptions options = new FirefoxOptions();

            // Selenium Grid URL
            URL gridUrl = new URL("http://localhost:4444/wd/hub");

            // Initialize WebDriver
            WebDriver driver = new RemoteWebDriver(gridUrl, options);

            // Navigate to a website
            driver.get("https://example.com");

            // Print the page title to confirm the test ran
            System.out.println("Page title is: " + driver.getTitle());

            // Close the browser
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
