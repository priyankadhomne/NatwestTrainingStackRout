import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactFormTests {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/home/ubuntu/Documents/AssignmentOFSelenium1/src/test/java/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mycontactform.com/samples.php");
        driver.manage().window().maximize();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='contactForm']/table/tbody/tr[1]/td/div/input[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/div/input[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/div/input[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"subject\"]")).sendKeys("Selenium Testing");
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("priyanka@rbos.com");
        driver.findElement(By.xpath("//*[@id=\"q1\"]")).sendKeys("Selenium");
        driver.findElement(By.xpath("//*[@id=\"q2\"]")).sendKeys("Selenium Testing is automation testing ");

        WebElement element = driver.findElement(By.xpath("//select[@id='q3']"));
        Select select = new Select(element);
        Thread.sleep(3000);
        select.selectByVisibleText("Second Option");

        driver.findElement(By.id("q4")).click();

        driver.findElement(By.name("checkbox6[]")).click();


        driver.findElement(By.xpath("//*[@id=\"q7\"]")).sendKeys("27-03-2024");
        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"q8\"]"));
        Select select1 = new Select(element1);
        select1.selectByVisibleText("IN");

        WebElement element2 = driver.findElement(By.name("q9"));
        Select select2 = new Select(element2);
        select2.selectByVisibleText("India");

        WebElement element3 = driver.findElement(By.name("q10"));
        Select select3 = new Select(element3);
        select3.selectByVisibleText("British Columbia");

        WebElement element4 = driver.findElement(By.name("q11_title"));
        Select select4 = new Select(element4);
        select4.selectByVisibleText("Miss");

        driver.findElement(By.name("q11_first")).sendKeys("Meenakshi");
        driver.findElement(By.name("q11_last")).sendKeys("Sharma");

        WebElement element5 = driver.findElement(By.name("q12_month"));
        Select select5 = new Select(element5);
        select5.selectByVisibleText("8");

        WebElement element6 = driver.findElement(By.name("q12_day"));
        Select select6 = new Select(element6);
        select6.selectByVisibleText("3");

        WebElement element7 = driver.findElement(By.name("q12_year"));
        Select select7 = new Select(element7);
        select7.selectByVisibleText("2006");


        WebElement fileInput = driver.findElement(By.id("attach4589"));
        fileInput.sendKeys("/home/ubuntu/SeleniumForm/abc.txt");

        driver.findElement(By.name("visver_code")).sendKeys("8765A");

        driver.findElement(By.name("submit")).click();
    }
}
