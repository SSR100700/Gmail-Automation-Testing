import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
    This class is for login and rest of the assignment
*/

//surajtesting12102882@gmail.com
//Suraj@12102882

public class Assignment1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox");

//        Enter Email
        WebElement enterEmail = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
        enterEmail.clear();
        enterEmail.sendKeys("surajtesting12102882@gmail.com");
        Thread.sleep(2000);
//        next
        WebElement next1 = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span"));
        next1.click();
        Thread.sleep(4000);
//        Enter password
        WebElement enterPassword = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
        enterPassword.clear();
        enterPassword.sendKeys("Suraj@12102882");
        Thread.sleep(4000);
//        next
        WebElement next2 = driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span"));
        next2.click();
        Thread.sleep(20000);

//        compose
        driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div/div")).click();
//        verify new mail window is opened
        WebElement newWindow = driver.findElement(By.xpath("//*[@id=\":5h\"]/h2/div[2]/span"));
        boolean verifyNewWindow = newWindow.isDisplayed();
        if(verifyNewWindow)
            System.out.println("New Mail Window Displayed");
        else
            System.out.println("Some exception. holdup:/ let me check:)..\nSuraj Doctor on mission--->/)\nsheesh.. i am dead tired.All done try ot rerun the program;;:)");

//        enter "TO" email
        driver.findElement(By.xpath("//*[@id=\":c3\"]")).sendKeys("surajsingh100700@gmail.com");
//        enter subject
        driver.findElement(By.xpath("//*[@id=\":8h\"]")).sendKeys("Testing for Assignment-1.01 by suraj singh");
//        enter Body
        driver.findElement(By.xpath("//*[@id=\":9r\"]")).sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
//        click send
        driver.findElement(By.xpath("//*[@id=\":87\"]")).click();
        System.out.println("Captain. All work is done. special thanks to Suraj");
    }
}
