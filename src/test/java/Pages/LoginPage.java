package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    public static By acceptButton = By.xpath("//*[@id=\"cmpwelcomebtnyes\"]/a");
    public static By emailTextbox = By.id("email");
    public static By passwordTextbox = By.id("password");
    public static By submitButton = By.xpath("//button[@type='submit']");





    public void acceptCookie(){
        driver.findElement(acceptButton).click();
    }
    public void enterUserName(String name){
        driver.findElement(emailTextbox).sendKeys(name);
    }
    public void enterPassword(String password){
        driver.findElement(emailTextbox).sendKeys(password);
    }

    public void clickSignIn(){
        driver.findElement(emailTextbox).click();
    }

}
