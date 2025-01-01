import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class First {
    public static void main(String[] args) {
        //Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
      
  // Initialize the WebDriver (ChromeDriver)
        WebDriver driver = new ChromeDriver();

        // Open a website
        driver.get("https://www.google.com");
// Get the title of the page and print it
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);

        // Check if the title is correct
        if (title.equals("Google")) {
            System.out.println("Title verification passed.");
        } else {
            System.out.println("Title verification failed.");
        }

        // Close the browser
        driver.quit();
    }
}

