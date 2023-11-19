package StepDefenitions;

import Pages.LoginPage;
import Pages.createAppointment;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static Pages.LoginPage.*;
import static Pages.createAppointment.*;
import org.assertj.core.api.SoftAssertions;

public class LoginSteps {

    WebDriver driver=null;
    SoftAssertions softAssertions;
   // System.setProperty("webdriver.chrome.driver","C:\Users\Thayaparan\Downloads\chromedriver-win64\chromedriver.exe")

    @Given("user is in login page")
    public void user_is_in_login_page() throws InterruptedException {
        LoginPage login = new LoginPage(driver);

        // web Driver intialization
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Thayaparan\\Downloads\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        //navigate to the web login URL
        driver.get("https://app.alt.thegpservice.com/register/login");
        //maxmizithe the window
        driver.manage().window().maximize();
        //apply waits
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //accept cookies
        driver.findElement(acceptButton).click();
        //Type Email
        driver.findElement(emailTextbox).sendKeys("ruby1@mailinator.com");
        //Type password
        driver.findElement(passwordTextbox).sendKeys("Shakila@123");
        //click On submit button
        driver.findElement(submitButton).click();

    }
    @When("fill the required fields")
    public void fill_the_required_fields() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(clickOnDoctors).click();     //click on doctors's appointment link
        driver.findElement(selectTime).click();     //select appointment time
        driver.findElement(complaint).sendKeys("Feeling feverish");     //write cpmplaints
        driver.findElement(postalcode).sendKeys("AL3 8QE");     // enter postal code
        driver.findElement(findPharmacy).click();   //find nearest pharmacy
        driver.findElement(selectPharmacy).click();     //Select one of the pharmacy

    }
    @And("book an appointment")
    public void book_an_appointment() {
        driver.findElement(confirmAppointment).click();     //Click on confirmation
    }
    @Then("verify Confirmation of successful booking submission")
    public void verify_confirmation_of_successful_booking_submission() {
       // softAssertions = new SoftAssertions();
        String verifyMessages = driver.findElement(createAppointment.verifyMessage).getText();
        String expected = "Please check your order details below. The price for the consultation excludes the cost of any prescription the Doctor may propose. Should you require any additional services such as fit notes, referral letters or an extended consultation, you will be informed of further charges during the consultation. If the Doctor generates a prescription the cost for the treatment will be determined and charged for by your selected pharmacy.";
        System.out.println(verifyMessages);
        //Verify the Suucesfully message
        Assert.assertEquals(" Registration Succesfull", expected, verifyMessages);
        driver.close();
    }

}
